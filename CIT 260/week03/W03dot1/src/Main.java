//Source code file for project W03dot1
//Name: Matthew Felton
//Date last modified: 9/29/21
//Course: CIT-260

//import scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tells user what the program does
        System.out.println("This program will take a given date and look for what day it will be in the further.");
        // Prompt user for value day of week
        System.out.print("Enter today date code (0 for Sunday, 1 for Monday, etc): ");
        Scanner inputOne = new Scanner(System.in);
        // store value recorded
        int date = inputOne.nextInt();
        // Determine if input is valid
        if (date >= 0 && date <= 6) {
            // Prompt user for number of days in the future
            System.out.print("Enter number of days in future: ");
            Scanner inputTwo = new Scanner(System.in);
            // Store value recorded
            int time = inputTwo.nextInt();
            // Determine if input is valid
            if (time >= 0) {
                // calculate the day of the week in future and store it.
                double future = ( date + time) % 7;
                // define a string for day of week
                String dayOfweek ="";
                // assign day to number with a switch
                switch (date) {
                    case 0: dayOfweek = "Sunday"; break;
                    case 1: dayOfweek = "Monday"; break;
                    case 2: dayOfweek = "Tuesday"; break;
                    case 3: dayOfweek = "Wednesday"; break;
                    case 4: dayOfweek = "Thursday"; break;
                    case 5: dayOfweek = "Friday"; break;
                    case 6: dayOfweek = "Saturday"; break;
                }
                // display day of week for today and day of week in future
                if (future == 0){
                    System.out.printf("Today is %s and the future day will be Sunday %n", dayOfweek);
                }else if(future == 1){
                    System.out.printf("Today is %s and the future day will be Monday %n", dayOfweek);
                }else if(future == 2){
                    System.out.printf("Today is %s and the future day will be Tuesday %n", dayOfweek);
                }else if(future == 3){
                    System.out.printf("Today is %s and the future day will be Wednesday %n", dayOfweek);
                }else if(future == 4){
                    System.out.printf("Today is %s and the future day will be Thursday %n", dayOfweek);
                }else if(future == 5){
                    System.out.printf("Today is %s and the future day will be Friday %n", dayOfweek);
                }else if(future == 6){
                    System.out.printf("Today is %s and the future day will be Saturday %n", dayOfweek);
                }
            } else {
                // return invalid negative number and end
                System.out.println("The number can not be negative.");
            }
        } else {
            // return invalid number and end
            System.out.println("The number is an invalid date.");
        }
        // output goodbye message
        System.out.println("Thank you for your time, Good Bye.");
    }
}
