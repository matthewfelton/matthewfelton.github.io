// source code for w02dot2
// name: Matthew Felton
// date last modified: 9/25/2021
// course: CIT-260

//imports scanner class
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // tax rate double
        final double TAX_RATE = 0.032;

        // Outputs the purpose of the code
        System.out.print("This will take your meal cost and tip percentage and assist you by giving you ");
        System.out.println("the tip, tax, total bill amount.");

        // ask user for meal price input
        Scanner priceInput = new Scanner(System.in);
        System.out.print("Enter your meal price: ");

        // stores meal data as double price
        double price = priceInput.nextDouble();

        // ask user for tip percent
        Scanner tipInput = new Scanner(System.in);
        System.out.print("Enter the Percent of your tip: ");

        // stores tipInput amount moves decimal place twice and multiplies the price to be stored as tip double
        double tip = (price * (tipInput.nextDouble() / 100));



        // stores tax amount as tax double
        double tax = (price * TAX_RATE);

        // stores total amount as a double
        double total = (price + tip + tax);

        // decimal format class to define a pattern for output.
        // DecimalFormat fn = new DecimalFormat("$###.##");

        // output tip amount using string class
        // System.out.println("The Tip is $" + String.format("%.2f", tip));
        // Better way to do the numbers
        System.out.format("The Tip is $%4.2f%n", tip);

        // output tax amount using int and string format
        System.out.println("The Tax is $" + String.format("%.2f", tax));


        // output total price using string format class
        System.out.println("The Total cost is $" + String.format("%.2f", total));

        // output goodbye
        System.out.println("Thank you and GoodBye");
    }
}
