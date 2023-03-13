public class BaseEmployee extends Employee {
    private float baseSalary;

    BaseEmployee() {
        this.baseSalary = 0;
    }

    public float getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }
}