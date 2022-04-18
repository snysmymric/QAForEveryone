package HW7_2;

public class Month {
    private String name;
    private int days;
    private int workDays;

    public Month (){}

    public Month(String name, int days, int workDays) {
        this.name = name;
        this.days = days;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
}
