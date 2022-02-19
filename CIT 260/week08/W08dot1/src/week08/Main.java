// Source code file for project W08dot1
// Name: Matthew Felton
// Date last modified: 11/3/21
// Course: CIT-260
// Secret Code: "Programming is fun"


package week08;

public class Main {

    public static void main(String[] args) {
        // purpose of program
        System.out.println("This program will take two preassigned sides and print the height, width, area, and perimeter");
        // create rectangle 1 data
        Rectangle rectangle1 = new Rectangle(4, 40);
        // create rectangle 2 data
        Rectangle rectangle2 = new Rectangle(3.5, 5);


        // returns and display rectangle 1 data
        System.out.println("\nRectangle 1");
        System.out.print("Width = ");
        System.out.printf("%.2f\n", rectangle1.getWidth());
        System.out.print("Height = ");
        System.out.printf("%.2f\n", rectangle1.getHeight());
        System.out.print("Area = ");
        System.out.printf("%.2f\n", rectangle1.getArea());
        System.out.print("Perimeter = ");
        System.out.printf("%.2f\n",  rectangle1.getPerimeter());
        // returns and display rectangle 2 data
        System.out.println("\nRectangle 2");
        System.out.print("Width = ");
        System.out.printf("%.2f\n", rectangle2.getWidth());
        System.out.print("Height = ");
        System.out.printf("%.2f\n", rectangle2.getHeight());
        System.out.print("Area = ");
        System.out.printf("%.2f\n", rectangle2.getArea());
        System.out.print("Perimeter = ");
        System.out.printf("%.2f\n",  rectangle2.getPerimeter());
        // goodbye message
        System.out.println("\nThank you and Goodbye");
    }
}
