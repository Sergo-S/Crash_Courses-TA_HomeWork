package task8;

public class ContractEmployee extends Employee implements CalculatePay{
    protected String federalTaxidmember;
    protected int fixed_monthly_payment;

    public ContractEmployee(String federalTaxidmember, String name, int fixed_monthly_payment) {
        super(federalTaxidmember, name);
        this.fixed_monthly_payment = fixed_monthly_payment;
    }

    public int calculatePay(){
        this.average_monthly_salary = this.fixed_monthly_payment;
        return this.average_monthly_salary;
    }

    @Override
    public String toString() {
        return this.name+":"+
                "\nFederal Tax ID Member = " + this.employeeID +
                "\nAverage Monthly Salary = " + this.calculatePay()+"\n";
    }
}
