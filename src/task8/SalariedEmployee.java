package task8;

public class SalariedEmployee extends Employee implements CalculatePay{
    protected String socialSecurityNumber;
    protected int hourly_rate;
    protected int hours_of_work;

    public SalariedEmployee(String socialSecurityNumber, String name, int hourly_rate, int hours_of_work){
        super(socialSecurityNumber, name);
        this.hourly_rate = hourly_rate;
        this.hours_of_work = hours_of_work;
    }

    public int calculatePay(){
        this.average_monthly_salary = this.hourly_rate*this.hours_of_work;
        return this.average_monthly_salary;
    }

    @Override
    public String toString() {
        return this.name+":"+
                "\nSocial Security Number = " + this.employeeID +
                "\nAverage Monthly Salary = " + this.calculatePay()+"\n";
    }
}
