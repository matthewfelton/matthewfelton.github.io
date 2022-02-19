// Source code file for project W07dot2
// Name: Matthew Felton
// Date last modified: 10/26/21
// Course: CIT-260


import java.util.Arrays;

public class Main {
    /**
     * The Main Method
     * Purpose: Contain the main program
     * return List of employees and total hours worked
     */
    public static void main(String[] args) {
        // defines purpose of program
        System.out.println("This program will display the amount of hours worked for each employee.");
        // creates one dimensional array
        String[] names = {
                "Tara Teamlead   ",
                "Harry Hacker    ",
                "Carl Coder      ",
                "Paula Programmer",
                "Darrin Debugger "
        };
        // creates two dimensional array
        double[][] hours = {
                {0, 0, 0, 0, 0},
                {8, 9, 8.5, 4.75, 0},
                {8, 9, 8, 6, 0},
                {8.5, 8.5, 8.6, 6.25, 0},
                {8, 8, 8.6, 6.5, 5.25},
                {9, 7.5, 9.5, 0, 5.25},
                {0, 0, 2, 0, 6}
        };
        // defines a container for total hour array
        double[] totalHours = hoursSum(hours);
        // output header
        System.out.println("Employee Name         Total Hours");
        // output arrays
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s%11.2f%n", names[i], totalHours[i]);
        }
        // outputs goodbye
        System.out.println("Thank you and Goodbye.");
    }
    /**
     * The hoursSum Method
     * Purpose: adds inner array and converts to 1d array
     * param 2d array of numbers
     * return 1d array of numbers
     */
    public static double[] hoursSum(double[][] hours) {
        // determines new array size
        double[] sum = new double[hours.length];
        // add/ converts 2d array to 1d array
        // loop through the first dimension of the array
        for (int i = 0; i < hours.length; i++) {
            // loops through inner array
            for (int j = 0; j < hours[i].length; j++) {
                // adds inner arrays
                sum[j] += hours[i][j];
            }
        }
        return sum;
    }
}
