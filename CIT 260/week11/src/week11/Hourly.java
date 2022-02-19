// Source code file for Hourly class
// Name: Matthew Felton
// Date last modified: 11/23/21
// Course: CIT-260



package week11;

public class Hourly extends Employee {
    private final double STATE = 0.07;
    private final double FED = 0.15;
    private double hourlyWage;
    private double hoursWorked;

    /**
     * no-arg Constructor
     *
     */
    public Hourly() {
        setName("none");
        setId(0);
        this.hourlyWage = 0;
        this.hoursWorked = 0;
    }

    /**
     * arg Constructor
     * @param wage
     * @param hours
     */
    public Hourly(String name, int id, double wage, double hours) {
        super(name, id);
        this.hourlyWage = wage;
        this.hoursWorked = hours;
    }

    /**
     * getWage Method
     * @return hourlyWage
     */
    public double getWage() {
        return hourlyWage;
    }
    /**
     * getHours Method
     * @return hourWorked
     */
    public double getHours() {
        return hoursWorked;
    }
    /**
     * setWage Method
     * @param wage
     */
    public void setWage(Double wage) {
        this.hourlyWage = wage;
    }
    /**
     * setHours Method
     * @param hours
     */
    public void setHours(Double hours) {
        this.hoursWorked = hours;
    }

    /**
     * getGross Pay Child method
     * @return Gross pay
     */
    @Override
    public double getGrossPay() {
        return (getHours() * getWage());
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
