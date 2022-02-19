// Source code file for class BankAccount
// Name: Matthew Felton
// Date last modified: 11/3/21
// Course: CIT-260



package week08;

public class BankAccount {
    // defines accountNumber
    private double accountNumber;
    // defines balance
    private double balance;
    /**
     * no-arg constructor
     *
     */
    public BankAccount() {
        accountNumber = 0;
        balance = 0;
    }
    /**
     * parameterized constructor
     * purpose: intialize the data members
     * @param accountNumber
     * @param balance
     */
    public BankAccount(double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    /**
     * getAccount method
     * purpose: to get the value of the account number
     * @return accountNumber
     */
    public double getAccount() {
        return accountNumber;
    }
    /**
     * getBalance method
     * purpose: to get the value of the balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * setAccount method
     * purpose: sets value of accountNumber
     * @param accountNumber
     */
    public void setAccount(double accountNumber) {
        this.accountNumber = accountNumber;
    };

    /**
     * setBalance method
     * purpose: sets value of balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * makeDeposit method
     * purpose: add an amount to the balance double
     * @param deposit
     * @return new balance
     */
    public double makeDeposit(double deposit) {
        this.balance += deposit;
        return balance;
    }
    /**
     * makeWithdrawal method
     * purpose: subtract an amount to the balance double
     * @param withdrawal
     * @return new balance
     */
    public double makeWithdrawal(double withdrawal) {
        this.balance -= withdrawal;
        return balance;

    }
}
