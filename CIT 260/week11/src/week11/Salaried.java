// Source code file for Salaried Class
// Name: Matthew Felton
// Date last modified: 11/23/21
// Course: CIT-260



package week11;

public class Salaried extends Employee {
    private final double STATE = 0.07;
    private final double FED = 0.15;
    private double annualSalary;

    /**
     * no-arg Constructor
     */
    public Salaried() {
        setName("none");
        setId(0);
        this.annualSalary = 0;
    }
    /**
     * arg Constuctor
     * @param salary
     */
    public Salaried(String name, int id, double salary) {
        super(name, id);
        this.annualSalary = salary;
    }

    /**
     * getSalary Method
     * @return Salary
     */
    public double getSalary() {
        return annualSalary;
    }
    /**
     * setSalary Method
     * @param salary
     */
    public void setSalary(double salary) {
        this.annualSalary = salary;
    }

    /**
     * getGross Pay Child method
     * @return Gross pay
     */
    @Override
    public double getGrossPay() {
        return (getSalary() / 52);
    }
    /**
     * getFedWithholding Pay Child method
     * @return fed withholding
     */
    @Override
    public double getFedWithholding() {
        return (getGrossPay() * FED);
    }
    /**
     * getStateWithholding Pay child method
     * @return  state withholding
     */
    @Override
    public double getStateWithholding() {
        return (getGrossPay() * STATE);
    }
    /**
     * getNetPay method
     * @return Netpay
     */
    public double getNetPay() {
        return (getGrossPay() - getStateWithholding() -getFedWithholding());
    }
    /**
     * toString Method child
     * @return String of hourly employee data
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nGross Pay: $" + (String.format("%,.2f", getGrossPay())) +
                "\nFederal Withholding: $" + (String.format("%,.2f", getFedWithholding())) +
                "\nState Withholding: $" + (String.format("%,.2f", getStateWithholding())) +
                "\nNet Pay: $" + (String.format("%,.2f\n\n", getNetPay()));
    }

}
