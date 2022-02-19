// Source code file for project W06dot2
// Name: Matthew Felton
// Date last modified: 10/19/21
// Course: CIT-260


public class Main {
    /**
     * The Main Method
     * Purpose: Contain the main program
     */
    public static void main(String[] args) {
	    // generate table heading
        System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius");
        System.out.println("----------------------------------------------------------");
        // generate table data with for loop
        for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31; celsius--, fahrenheit-= 10) {
            System.out.printf("%.1f", celsius);
            System.out.printf("%13.1f", celsiusToFahrenheit(celsius));
            System.out.printf("%11s", "|");
            System.out.printf("     %5.1f", fahrenheit);
            System.out.printf("%15.2f\n", fahrenheitToCelsius(fahrenheit));
        }

        // Goodbye
        System.out.println("Thank you and Goodbye");
    }
    /**
     * The celToFah Method
     * Purpose: Contain the main program
     * param celsius
     * return fahrenheit
     */
    public static double celsiusToFahrenheit(double tempCelsius) {
        // calculates Fahrenheit
        return ( 9.0 / 5 ) * tempCelsius + 32;
    }
    /**
     * The fahToCel Method
     * Purpose: Contain the main program
     * param fahrenheit
     * return celsius
     */
    public static double fahrenheitToCelsius(double tempFahrenheit) {
        // Calculates Celsius
        return ( 5.0 / 9) * (tempFahrenheit - 32);
    }

}
