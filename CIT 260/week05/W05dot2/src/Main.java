// Source code file for project W05dot2
// Name: Matthew Felton
// Date last modified: 10/12/21
// Course: CIT-260

public class Main {

    public static void main(String[] args) {
	    // Output Message one Program purpose in life.
        System.out.println("This program will Show all numbers from 100 to 1000 that are divisible by 5 and 6.\n");
        // declare our constant for count line
        final int LINE_AMOUNT = 10;
        // declare count start
        int count = 0;
        // check for numbers between 100 and 1000
        for (int i = 100; i <= 1000; i++) {
            // check for number being divisible by 5 and 6
            if (i % 5 == 0 && i % 6 == 0) {
                // increase count value
                count++;
                // check for line limit
                if (count % LINE_AMOUNT == 0) {
                    //print new line

                    System.out.println(i);
                } else {
                    System.out.print(i + " ");

                }
            }
        }
        //print goodbye
        System.out.println("\nGood Bye and Thank you");
    }
}
