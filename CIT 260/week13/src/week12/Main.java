// Source code file for project W13dot1
// Name: Matthew Felton
// Date last modified: 12/7/21
// Course: CIT-260



package week12;

import java.util.ArrayList;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // program purpose
        System.out.println("This program outputs to a text the area of various shapes assigned to an Identifier number" +
                "and displays the information back.");

        // generates array
        ArrayList<Shape> object = new ArrayList<>();
        // creates object shapes
        Circle s1 = new Circle("Circle  ", 156, 1, 1, 10);
        Square s2 = new Square("Square  ", 237, 1, 3, 2);
        RightTriangle s3 = new RightTriangle("Triangle", 212, 3, 3, 3,4);
        // adds to array
        object.add(s1);
        object.add(s2);
        object.add(s3);

        try (PrintWriter output = new PrintWriter(new File("data.txt"))) {
            output.println("\nShape      ID  Position  Area");
            for (int i = 0; i <object.size(); i++) {
                output.println(object.get(i).toString());
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Error: There was an error creating the file.");
            System.exit(1);
        }

        try (Scanner fileRead = new Scanner(new File("data.txt"))) {

            while (fileRead.hasNextLine()) {
                String n = fileRead.nextLine();
                System.out.println(n);

            }
        }
        catch (IOException e) {
            System.out.println("Error: cannot open the file for reading.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: bad data in file, cannot continue");
        }
        // goodbye
        System.out.println("Thank you and Goodbye");
    }
}
