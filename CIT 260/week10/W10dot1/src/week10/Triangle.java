// Source code file for Triangle class
// Name: Matthew Felton
// Date last modified: 11/16/21
// Course: CIT-260



package week10;

public class Triangle extends GeometricObject {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    /**
     * no-arg constructor
     *
     */
    public Triangle() {
        sideOne = 1.0;
        sideTwo = 1.0;
        sideThree = 1.0;
    }
    /**
     *  Contructor
     * @param a
     * @param b
     * @param c
     */
    public Triangle(double a, double b, double c) {
        this.sideOne = a;
        this.sideTwo = b;
        this.sideThree = c;
    }
    /**
     * getSideOne Method
     * @return sideOne
     */
    public double getSideOne() {
        return sideOne;
    }
    /**
     * getSideTwo Method
     * @return sideTwo
     */
    public double getSideTwo() {
        return sideTwo;
    }
    /**
     * getSideThree Method
     * @return sideThree
     */
    public double getSideThree() {
        return sideThree;
    }

    /**
     * setSideOne method
     * @param a
     */
    public void setSideOne(double a) {
        this.sideOne = a;
    }
    /**
     * setSideTwo method
     * @param b
     */
    public void setSideTwo(double b) {
        this.sideTwo = b;
    }
    /**
     * setSideThree method
     * @param c
     */
    public void setSideThree(double c) {
        this.sideThree = c;
    }

    public double getArea() {
        double s = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
    }

    @Override
    public String toString() {
        String areaFormat = String.format("Area: %.2f", getArea());
        String value = "Triangle: Side 1 = "
                + getSideOne()
                + " Side 2 = "
                + getSideTwo()
                + " Side 3 = "
                + getSideThree();
        return  value + "\n" + super.toString() + "\n" + areaFormat;
    }
}


