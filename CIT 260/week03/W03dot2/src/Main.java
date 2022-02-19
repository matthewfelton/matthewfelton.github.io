//Source code file for project W03dot2
//Name: Matthew Felton
//Date last modified: 9/29/21
//Course: CIT-260

//import scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Tell user what the program does
        System.out.println("This program will take given year and provide number of days in a given month.");
        // prompt user for year input
        System.out.print("Please input the year: ");
        Scanner inputOne = new Scanner(System.in);
        // saves year data
        int year = inputOne.nextInt();
        // determine if year entered is leap year.
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        // prompt user for to enter a month value (1-12)
        System.out.print("Please select a month (1-12 range): ");
        Scanner inputTwo = new Scanner(System.in);
        // saves month data
        int month = inputTwo.nextInt();
        // validate month input
        if (month < 1 || month > 12) {
            // not a valid input
            System.out.println("This is not a valid month value.");
        } else {
            // calculate days in month with a switch
            switch (month) {
                case 1: System.out.println("January " + year + " had 31 days."); break;
                case 2:
                    // assigns data based on leap year true or false
                    if (leapYear) {
                        // leap year
                        System.out.println ("February " + year + " had 29 days and was a leap year.");
                    } else {
                        // no leap year
                        System.out.println ("February " + year + " had 28 days.");
                    } break;
                case 3: System.out.println("March " + year + " had 31 days."); break;
                case 4: System.out.println("April " + year + " had 30 days."); break;
                case 5: System.out.println("May " + year + " had 31 days."); break;
                case 6: System.out.println("June " + year + " had 30 days."); break;
                case 7: System.out.println("July " + year + " had 31 days."); break;
                case 8: System.out.println("August " + year + " had 31 days."); break;
                case 9: System.out.println("September " + year + " had 30 days."); break;
                case 10: System.out.println("October " + year + " had 31 days."); break;
                case 11: System.out.println("November " + year + " had 30 days."); break;
                case 12: System.out.println("December " + year + " had 31 days."); break;
            }
        }
            // end message
            System.out.println("Thank you and Good Bye");
    }

}
