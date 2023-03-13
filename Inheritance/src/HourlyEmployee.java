public class HourlyEmployee extends Employee {
    private float wage;
    private int totalHoursWorked;

    HourlyEmployee() {
        this.wage = 0;
        this.totalHoursWorked = 0;
    }

    public float getWage() {
        return this.wage;
    }

    public int getTotalHoursWorked() {
        return this.totalHoursWorked;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
}