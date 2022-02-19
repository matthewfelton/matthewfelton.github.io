// Source code file for project W10dot1
// Name: Matthew Felton
// Date last modified: 11/16/21
// Course: CIT-260


package week10;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final int SIZE = 3;
        // outputs purpose
        System.out.println("This program gets input for a triangle from the user. " +
                "\nIt then creates a Triangle object and displays its description.");
        // generate scanner
        Scanner input = new Scanner(System.in);

        Triangle triangle = new Triangle();

        // prompt user for color
        System.out.println(" Enter a color: ");
        String col = input.next();
        triangle.setColor(col);
        // prompt user for filled
        System.out.println("IS the triangle filled (y or n)? ");
        String fill = input.next();
        triangle.SetFilled(fill);
        // prompt user for sides
        System.out.println("Enter the non-zero, positive lengths of the three sides of the triangle: ");
        double[] sides = new double[SIZE];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = input.nextDouble();
        }
        triangle.setSideOne(sides[0]);
        triangle.setSideTwo(sides[1]);
        triangle.setSideThree(sides[2]);

        // print out string
        System.out.println(triangle.toString());

        // goodbye
        System.out.println("Thank you and Goodbye");
    }
}
