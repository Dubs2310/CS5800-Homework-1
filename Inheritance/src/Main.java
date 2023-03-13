public class Main {
    public static void main(String[] args) throws Exception {
        SalariedEmployee e1 = new SalariedEmployee();
        e1.setFirstName("Joe");
        e1.setLastName("Jones");
        e1.setSSN("111-11-1111");
        e1.setWeeklySalary(2500);
        System.out.println(e1.getFirstName() + ", " + e1.getLastName() + ", " + e1.getSSN() + ", " + e1.getWeeklySalary());

        HourlyEmployee e2 = new HourlyEmployee();
        e2.setFirstName("Stephanie");
        e2.setLastName("Smith");
        e2.setSSN("222-22-2222");
        e2.setWage(25);
        e2.setTotalHoursWorked(32);
        System.out.println(e2.getFirstName() + ", " + e2.getLastName() + ", " + e2.getSSN() + ", " + e2.getWage() + ", " + e2.getTotalHoursWorked());

        HourlyEmployee e3 = new HourlyEmployee();
        e3.setFirstName("Mary");
        e3.setLastName("Quinn");
        e3.setSSN("333-33-3333");
        e3.setWage(19);
        e3.setTotalHoursWorked(47);
        System.out.println(e3.getFirstName() + ", " + e3.getLastName() + ", " + e3.getSSN() + ", " + e3.getWage() + ", " + e3.getTotalHoursWorked());

        CommissionEmployee e4 = new CommissionEmployee();
        e4.setFirstName("Nicole");
        e4.setLastName("Dior");
        e4.setSSN("444-44-4444");
        e4.setCommissionRate(15);
        e4.setGrossSales(50000);
        System.out.println(e4.getFirstName() + ", " + e4.getLastName() + ", " + e4.getSSN() + ", " + e4.getCommissionRate() + ", " + e4.getGrossSales());

        SalariedEmployee e5 = new SalariedEmployee();
        e5.setFirstName("Renwa");
        e5.setLastName("Chanel");
        e5.setSSN("555-55-5555");
        e5.setWeeklySalary(1700);
        System.out.println(e5.getFirstName() + ", " + e5.getLastName() + ", " + e5.getSSN() + ", " + e5.getWeeklySalary());

        BaseEmployee e6 = new BaseEmployee();
        e6.setFirstName("Mike");
        e6.setLastName("Davenport");
        e6.setSSN("666-66-6666");
        e6.setBaseSalary(95000);
        System.out.println(e6.getFirstName() + ", " + e6.getLastName() + ", " + e6.getSSN() + ", " + e6.getBaseSalary());

        CommissionEmployee e7 = new CommissionEmployee();
        e7.setFirstName("Mahnaz");
        e7.setLastName("Vaziri");
        e7.setSSN("777-77-7777");
        e7.setCommissionRate(22);
        e7.setGrossSales(40000);
        System.out.println(e7.getFirstName() + ", " + e7.getLastName() + ", " + e7.getSSN() + ", " + e7.getCommissionRate() + ", " + e7.getGrossSales());
    }
}