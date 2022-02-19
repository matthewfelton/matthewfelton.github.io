// Source code file for project W06dot1
// Name: Matthew Felton
// Date last modified: 10/19/21
// Course: CIT-260

// import scanner
import java.util.Scanner;

public class Main {
    /**
     * The Main Method
     * Purpose: Contain the main program
     * param money invested
     * param insurance percent
     * return year and future value end results
     */
    public static void main(String[] args) {
        // declare constants
        final int NUMBER_OF_YEARS = 10;
        final double CONVERTER = 1200;
        // create new scanner
        // states programs life purpose
        System.out.println("\nGiven and investment amount and interest rate,");
        System.out.println("this program will give a set number of years of");
        System.out.println("future values for each year.");
        // prompt user for investment amount
        System.out.print("\nPlease enter a positive and non-zero amount for an Investment: ");
        Scanner inputOne = new Scanner(System.in);
        // stores value
        double amount = inputOne.nextDouble();
        // Validates data and saves it in a double
        while ( amount <= 0 ) {
            System.out.print("This is not a valid entry, Please enter a Valid number: ");
            amount = inputOne.nextDouble();
        }
        // prompt user for investment rate
        System.out.print("Please enter your annual interest rate, between 0 and 100: ");
        Scanner inputTwo = new Scanner(System.in);
        // stores value
        double rate = inputTwo.nextDouble();
        // validate and loops till valid
        while ( rate < 0 || rate > 100 ) {
                System.out.print("This is not a valid entry, Please enter a Valid number: ");
                rate = inputTwo.nextDouble();
        }
        // get interest rate monthly by using a converter amount of months and converts it to a decimal
        double monthlyRate = rate / CONVERTER;
        // Display data collected and processed
        System.out.println("Year        Future Value");
        for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
            System.out.printf("%2d", years);
            System.out.printf("%12s", "$");
            System.out.printf("%.2f\n", futureValue(amount, monthlyRate, years));
        }
        // goodbye
        System.out.println("\nThank you and Goodbye");
    }

    /**
     * The futureValue Method
     * Purpose: Contain the main program
     * param money invested
     * param insurance percent
     * return future value
     */
    public static double futureValue(double investmentAmount, double monthlyInterestRate, int years) {
        //return data to future value double
        return investmentAmount * Math.pow( 1 + monthlyInterestRate, years * 12 );
    }
}
