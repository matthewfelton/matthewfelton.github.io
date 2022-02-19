// source code for w02dot1
// name: Matthew Felton
// date last modified: 9/21/2021
// course: CIT-260

// import Scanner class
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //creates a scanner class
        Scanner input = new Scanner(System.in);
        // outputs message to user
        System.out.print("This program is designed to convert your Celsius temperature ");
        System.out.println("to a Fahrenheit degree.");
        System.out.print("Please input a Celsius Degree to convert: ");
        //records data into double celsius (64-bit floating point)
        double celsius = input.nextDouble();
        //records data from celsius and converts into double fahrenheit
        double fahrenheit = ((9 * celsius) + (32 * 5)) / 5;
        //presents data conversion to user with string format
        System.out.println(celsius + " degrees celsius is equal to " + String.format("%.2f", fahrenheit) + " on Fahrenheith.");
    }
}
