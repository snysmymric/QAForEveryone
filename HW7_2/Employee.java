package HW7_2;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private double salaryInADay;

    public Employee (){}

    public Employee (String name, double salaryInADay) {
        this.salaryInADay = salaryInADay;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalaryInADay() {
        return salaryInADay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalaryInADay(double salaryInADay) {
        this.salaryInADay = salaryInADay;
    }

    public double getSalary (Month[] monthsArray) {
        double salary = 0;
        for (int i = 0; i < monthsArray.length; i++) {
            salary += monthsArray[i].getWorkDays() * salaryInADay;
        }
        return salary;


    }
    /**
     * Класс должен иметь метод - getSalary(Month[] monthArray),
     * метод возвращает зарплату за те месяцы которые были переданы
     * в качестве аргумента.
     */
    public double getSalaryMonth (Month[] monthsArray) {
        double salary = 0.0;
        for (int i = 0; i < MonthUtils.ARRAY_OF_MONTH.length; i++) {
            for (int j = 0; j < monthsArray.length; j++) {
                if (monthsArray[j].getName().equals(MonthUtils.ARRAY_OF_MONTH[i].getName())) {
                   salary += monthsArray[j].getWorkDays()*salaryInADay;
                }
            }
        }
        return salary;
    }
}
