// Source code file for project W08dot2
// Name: Matthew Felton
// Date last modified: 11/3/21
// Course: CIT-260



package week08;

public class Main {

    public static void main(String[] args) {
        // defines current withdraw and deposit consts
        final double DEPOSIT_ONE = 10.50;
        final double DEPOSIT_TWO = 3.25;
        final double WITHDRAW = 1.50;
        // purpose of program
        System.out.println("This Program tests the class BankAccount and balance amounts.");
        // defines account number and dollar amount of account to be pushed to class
        BankAccount account1 = new BankAccount(123, 5.00);
        // prints initial account data
        System.out.print("\n...Creating account ");
        System.out.printf("%.0f", account1.getAccount());
        System.out.print(" with a initial balance of $");
        System.out.printf("%.2f\n", account1.getBalance());
        // starts the deposit
        System.out.print("...Making a deposit of $");
        account1.makeDeposit(DEPOSIT_ONE);
        System.out.printf("%.2f\n", DEPOSIT_ONE);
        // starts the deposit
        System.out.print("...Making a deposit of $");
        account1.makeDeposit(DEPOSIT_TWO);
        System.out.printf("%.2f\n", DEPOSIT_TWO);
        // starts the withdrawal
        System.out.print("...Making a Withdrawal $");
        account1.makeWithdrawal(WITHDRAW);
        System.out.printf("%.2f\n", WITHDRAW);
        // prints new balance
        System.out.print("The Balance of Account Number ");
        System.out.printf("%.0f", account1.getAccount());
        System.out.print(" is ");
        System.out.printf("%.2f\n", account1.getBalance());
        // goodbye message
        System.out.println("\nThank you and Goodbye");
    }
}
