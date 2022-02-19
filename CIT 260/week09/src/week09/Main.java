// Source code file for project W09dot1
// Name: Matthew Felton
// Date last modified: 11/9/21
// Course: CIT-260



package week09;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // program purpose
        System.out.println("This program creates a point at (0,0) and a point at the coordinates \n" +
                "entered by you. It then computes and displays the distance from (0,0) \n" +
                "to the point defined by you, using three different methods.");
        // request inputOne and makes new scanner then saves to x
        System.out.print("Enter the x coordinate of a point: ");
        Scanner inputOne = new Scanner(System.in);
        int x = inputOne.nextInt();
        // request inputTwo and makes new scanner then saves to y
        System.out.print("Enter the y coordinate of a point: ");
        Scanner inputTwo = new Scanner(System.in);
        int y = inputTwo.nextInt();
        // creates new objects
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(x, y);
        // prints methods 1-3
        System.out.print("Using method 1, the distance from (" + p1.getX() + "," + p1.getY()
                        + ") to (" + (p2.getX() + "," + p2.getY()) +") is ");
        System.out.printf("%.2f\n", p1.distance(p2.getX(), p2.getY()));

        System.out.print("Using method 2, the distance from (" + p1.getX() + "," + p1.getY()
                + ") to (" + (p2.getX() + "," + p2.getY()) +") is ");
        System.out.printf("%.2f\n", p1.distance(p2));

        System.out.print("Using method 3, the distance from (" + p1.getX() + "," + p1.getY()
                + ") to (" + (p2.getX() + "," + p2.getY()) +") is ");
        System.out.printf("%.2f\n", p1.distance(p1, p2));


        // goodbye messages
        System.out.println("Thank you and Goodbye");
    }
}