public class SalariedEmployee extends Employee {
    private float weeklySalary;

    SalariedEmployee() {
        this.weeklySalary = 0;
    }

    public float getWeeklySalary() {
        return this.weeklySalary;
    }

    public void setWeeklySalary(float weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}