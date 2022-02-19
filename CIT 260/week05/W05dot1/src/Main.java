// Source code file for project W05dot1
// Name: Matthew Felton
// Date last modified: 10/12/21
// Course: CIT-260

public class Main {

    public static void main(String[] args) {
        // Assign a constant for data
        final double KILO_POUNDS = 2.2;
	    // Explain the use of the program
        System.out.println("This Program will display a Kilogram to pound table.");
        // heading title
        System.out.println(" Kilograms      Pounds");
        System.out.println(" ---------      ------");
        // display table with for loop
        for (int i = 1; i <= 15; i+=2) {
            System.out.printf(
                    " %2d%16.1f%n", i, (i * KILO_POUNDS));
        }
        System.out.println("Thank You and We hope this helps, GoodBye");
    }
}
