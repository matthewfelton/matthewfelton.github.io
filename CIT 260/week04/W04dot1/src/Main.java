// Source code file for project W04dot1
// Name: Matthew Felton
// Date last modified: 10/5/21
// Course: CIT-260

// import Scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Display Program's purpose in life.
        System.out.println("This Program will assist in converting a Hexadecimal digit to a four digit binary number");
        // Request input from user for a hexadecimal digit
        System.out.print("Please enter your hexadecimal number: ");
        Scanner inputOne = new Scanner(System.in);
        // saves inputOne to a string
        String hexDigit = inputOne.nextLine();
            // validate that only one digit has been entered.
        if (hexDigit.length() != 1) {
            // return invalid length.
            System.out.println("Please enter only one hexadecimal per conversion.");
            // return exit code
            System.exit(1);
        } else {
            // Uppercase data value if not already
            char ch = Character.toUpperCase(hexDigit.charAt(0));
            // validate if digit entered is hexadecimal
            if (('A' <= ch && ch <= 'F') || ('0' <= ch && ch <= '9')) {
                // converts hexadecimal to four digit binary number. ( no  toBinaryString())
                switch (ch) {
                    case '0': System.out.println("The hexadecimal " + ch + " is 0000 in Binary."); break;
                    case '1': System.out.println("The hexadecimal " + ch + " is 0001 in Binary."); break;
                    case '2': System.out.println("The hexadecimal " + ch + " is 0010 in Binary."); break;
                    case '3': System.out.println("The hexadecimal " + ch + " is 0011 in Binary."); break;
                    case '4': System.out.println("The hexadecimal " + ch + " is 0100 in Binary."); break;
                    case '5': System.out.println("The hexadecimal " + ch + " is 0101 in Binary."); break;
                    case '6': System.out.println("The hexadecimal " + ch + " is 0110 in Binary."); break;
                    case '7': System.out.println("The hexadecimal " + ch + " is 0111 in Binary."); break;
                    case '8': System.out.println("The hexadecimal " + ch + " is 1000 in Binary."); break;
                    case '9': System.out.println("The hexadecimal " + ch + " is 1001 in Binary."); break;
                    case 'A': System.out.println("The hexadecimal " + ch + " is 1010 in Binary."); break;
                    case 'B': System.out.println("The hexadecimal " + ch + " is 1011 in Binary."); break;
                    case 'C': System.out.println("The hexadecimal " + ch + " is 1100 in Binary."); break;
                    case 'D': System.out.println("The hexadecimal " + ch + " is 1101 in Binary."); break;
                    case 'E': System.out.println("The hexadecimal " + ch + " is 1110 in Binary."); break;
                    case 'F': System.out.println("The hexadecimal " + ch + " is 1111 in Binary."); break;
                }
                // output binary number with leading zeros if any
                } else {
                // return invalid and terminate user access
                System.out.println("The provided entry is not a Hexadecimal.");
                }
            }

        // GoodBye message
        System.out.println("Thank You for using our Converter, have a great day.");
    }
}
