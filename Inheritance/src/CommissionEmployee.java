public class CommissionEmployee extends Employee {
    private float commissionRate;
    private float grossSales;

    CommissionEmployee() {
        this.commissionRate = 0;
        this.grossSales = 0;
    }

    public float getCommissionRate() {
        return this.commissionRate;
    }

    public float getGrossSales() {
        return this.grossSales;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }
}