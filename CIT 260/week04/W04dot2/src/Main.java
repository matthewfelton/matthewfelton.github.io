// Source code file for project W04dot2
// Name: Matthew Felton
// Date last modified: 10/5/21
// Course: CIT-260

// import scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Define constants
        final double TAX_STATE = 0.09;
        final double TAX_FEDERAL = 0.2;
        final double OVERTIME_LIMIT = 40;
        final double NONE = 0;
        final double OVERTIME_RATE = 1.5;
        // Displays program's purpose in life
        System.out.println("This program will accept your name, hours worked, and hourly wage and return your name a break down of a pay stub.");
        // Prompt user for full name
        System.out.print("Please enter your full name: ");
        Scanner inputOne = new Scanner(System.in);
        // store name data as string
        String name = inputOne.nextLine();
        // Prompt user for hours worked
        System.out.print("Please enter the number of hours worked: ");
        Scanner inputTwo = new Scanner(System.in);
        // save hours data as int
        double hours = inputTwo.nextDouble();
        // determines valid input
        if (hours < 0) {
            System.out.println("Please enter a valid input for hours");
        } else {
            // Determine overtime and saves overtime hours
            if (hours > OVERTIME_LIMIT) {
                double overTime = hours - OVERTIME_LIMIT;
                // Prompt user for wage (hourly)
                System.out.print("Please enter your Hourly Wage: ");
                Scanner inputThree = new Scanner(System.in);
                // saves hrWage as double
                double hrWage = inputThree.nextDouble();
                // determine valid input
                if (hrWage < 0) {
                    System.out.println("Please enter a valid input for hourly wage");
                } else {
                    double overTimeGross =  (hrWage * OVERTIME_RATE) * overTime;
                    // process gross pay
                    double gross = (hrWage * hours) + overTimeGross;
                    // process state and federal taxes
                    double state = gross * TAX_STATE;
                    double federal = gross * TAX_FEDERAL;
                    // process net pay
                    double net = gross - state - federal;
                    // return all collected data with processes done
                    System.out.println("PayStub for " + name);
                    System.out.println("Hours Worked:  " + String.format("%.1f", hours));
                    System.out.println("Hourly Wage: $" + String.format("%.2f", hrWage));
                    System.out.println("Gross Pay: $" + String.format("%.2f", gross));
                    System.out.println("State Tax Withheld: $" + String.format("%.2f", state));
                    System.out.println("Federal Tax withheld: $" + String.format("%.2f", federal));
                    System.out.println("Net Pay: $" + String.format("%.2f", net));
                }

            } else {
                double overTime = NONE;
                // Prompt user for wage (hourly)
                System.out.print("Please enter your Hourly Wage: ");
                Scanner inputThree = new Scanner(System.in);
                // saves hrWage as double
                double hrWage = inputThree.nextDouble();
                // determine valid input
                if (hrWage < 0) {
                    System.out.println("Please enter a valid input for hourly wage");
                } else {
                    double overTimeGross =  (hrWage * OVERTIME_RATE) * overTime;
                    // process gross pay
                    double gross = (hrWage * hours) + overTimeGross;
                    // process state and federal taxes
                    double state = gross * TAX_STATE;
                    double federal = gross * TAX_FEDERAL;
                    // process net pay
                    double net = gross - state - federal;
                    // return all collected data with processes done
                    System.out.println("PayStub for " + name);
                    System.out.println("Hours Worked:  " + String.format("%.1f", hours));
                    System.out.println("Hourly Wage: $" + String.format("%.2f", hrWage));
                    System.out.println("Gross Pay: $" + String.format("%.2f", gross));
                    System.out.println("State Tax Withheld: $" + String.format("%.2f", state));
                    System.out.println("Federal Tax withheld: $" + String.format("%.2f", federal));
                    System.out.println("Net Pay: $" + String.format("%.2f", net));
                }
            }
        }


        // goodbye message
        System.out.println("Thank You and Goodbye.");








    }
}
