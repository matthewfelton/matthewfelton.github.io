// Source code file for project W07dot1
// Name: Matthew Felton
// Date last modified: 10/26/21
// Course: CIT-260


//import Scanner
import java.util.Scanner;

public class Main {
    /**
     * The Main Method
     * Purpose: Contain the main program
     * param array of number
     * return the mean and the deviation
     */
    public static void main(String[] args) {
        // assigns constants
        final int SIZE = 5;
        // creates scanner
        Scanner input = new Scanner(System.in);
        // declares purpose of program
        System.out.println("This program given a set of numbers will display the mean and deviation of them.");
        // Declares an array with size based on the constant
        double[] userInput = new double[SIZE];
        // asks user for the number of inputs
        System.out.println(" Please enter " + SIZE + " Numbers.");
        // cycles through the array index based on the length of the array
        for (int i = 0; i < userInput.length; i++) {
            // asks for number
            System.out.print(" Enter a number: ");
            // assigns an input to each index based on value of i
            userInput[i] = input.nextDouble();
        }
        // Displays the mean and deviation output
        System.out.print("The mean of the provided numbers is: ");
        System.out.printf("%.2f\n", mean(userInput));
        System.out.print("The standard deviation is: ");
        System.out.printf("%.2f\n", deviation(userInput));
        // GoodBye message
        System.out.println("Thank you and Goodbye.");
    }

    /**
     * The Mean Method
     * Purpose: Calculates the mean
     * param array of numbers
     * return the mean
     */
    public static double mean(double[] x) {
        // assigns a variable for the mean
        double mean = 0;
        // loops through array to grab values
        for (double numbers: x) {
            // add values from array into the mean
            mean += numbers;
        }
        // returns mean's value divided by length of array
        return mean / x.length;
    }
    /**
     * The deviation Method
     * Purpose: Ccalculates the deviation
     * param array of number
     * param the mean of numbers
     * return the deviation
     */
    public static double deviation(double[] x) {
        // assign a variable for the deviation
        double deviation = 0;
        // pulls mean data from mean method
        double mean = mean(x);
        // loops through for the array for equation
        for (double numbers: x) {
            // add numbers - mean raised to the second power
            deviation += Math.pow(numbers - mean, 2);
        }
        // returns data to table divided by length of array minus 1 squared
        return Math.sqrt(deviation / (x.length - 1));
    }
}