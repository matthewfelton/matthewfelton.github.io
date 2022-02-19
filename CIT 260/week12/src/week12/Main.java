// Source code file for project W12dot1
// Name: Matthew Felton
// Date last modified: 11/30/21
// Course: CIT-260



package week12;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // program purpose
        System.out.println("This program out puts the area of various shapes assigned to an Identifier number");
        // output title
        System.out.println("Identifier Area");
        // generates array
        ArrayList<Shape> object = new ArrayList<>();
        // creates object shapes
        Circle s1 = new Circle(156, 10);
        Square s2 = new Square(237,2);
        RightTriangle s3 = new RightTriangle(212,3,4);
        // adds to array
        object.add(s1);
        object.add(s2);
        object.add(s3);
        // loops through array and prints
        for (int i = 0; i <object.size(); i++) {
            System.out.println(object.get(i).toString());
        }
        // goodbye
        System.out.println("Thank you and Goodbye");
    }
}
