package HW7_2;

public class Main {
    public static void main(String[] args) {

        Employee myEmployee = new Employee("Anna Fedorova",
                1300.0);

        System.out.println(myEmployee.getName());
        myEmployee.getSalary(MonthUtils.ARRAY_OF_MONTH);
        System.out.println(myEmployee.getSalary(MonthUtils.ARRAY_OF_MONTH));

        Month[] arrayMonth = {
                new Month("January", 31, 19),
                new Month("April",30,21),
                new Month("August",31,23)};

        Employee myEmployee2 = new Employee();
        myEmployee2.setSalaryInADay(1500);
        System.out.println(myEmployee.getSalary(arrayMonth));
        System.out.println(myEmployee2.getSalaryMonth(arrayMonth));

        Manager myManager = new Manager("Anna Fedorova", 1800,15);
        System.out.println(myManager.getSalary(arrayMonth));


    }
}
