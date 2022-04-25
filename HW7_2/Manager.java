package HW7_2;

public class Manager {
    private String name;
    private int age;
    private String gender;
    private double salaryInDay;
    private int subordinates;

    public Manager() {}

    public Manager(String name,int age,String gender,double salaryInDay,
                   int subordinates) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryInDay = salaryInDay;
        this.subordinates = subordinates;
    }

    public Manager(String name,double salaryInDay,int subordinates) {
        this.name = name;
        this.salaryInDay = salaryInDay;
        this.subordinates = subordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalaryInDay() {
        return salaryInDay;
    }

    public void setSalaryInDay(double salaryInDay) {
        this.salaryInDay = salaryInDay;
    }

    public int getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(int subordinates) {
        subordinates = subordinates;
    }

    /**
     * Класс должен иметь метод -
     * getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы
     * которые были переданы в качестве аргумента.
     * К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
     *
     */
    public double getSalary (Month[] monthArray) {
        double salary = 0;
        double percentOfSalary ;
        for (int i = 0; i < MonthUtils.ARRAY_OF_MONTH.length; i++) {
            for (int j = 0; j < monthArray.length; j++) {
                if (monthArray[j].getName().equals(MonthUtils.ARRAY_OF_MONTH[i].getName())) {
                   salary += monthArray[j].getWorkDays() * salaryInDay;
                }
            }
        }
        percentOfSalary = (salary * subordinates) / 100;

        return salary + percentOfSalary;

    }
}
