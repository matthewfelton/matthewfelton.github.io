// Source code file for project W11dot1
// Name: Matthew Felton
// Date last modified: 11/23/21
// Course: CIT-260



package week11;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // Program purpose and title
        System.out.println("\nThis Program will report pay roll for multiple employees based on" +
                " Hourly or Salaried pay type.");
        System.out.println("\nPayroll Report");

        // create ArrayList<Employee>
        ArrayList<Employee> staff = new ArrayList<>();

        Hourly h1 = new Hourly("Harry Hacker", 123, 15.00, 30);

        Hourly h2 = new Hourly("Isabel Intern", 233, 12.50, 20);

        Salaried s1 = new Salaried("Cathy Coder", 611, 80000);

        staff.add(h1);
        staff.add(h2);
        staff.add(s1);


        for (int i = 0; i < staff.size(); i++) {
            System.out.print(staff.get(i).toString());
        }

        // goodbye
        System.out.println("\nThank you and Goodbye");
    }
}
