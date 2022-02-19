// Source code file for Rectangle class
// Name: Matthew Felton
// Date last modified: 11/3/21
// Course: CIT-260


package week08;

public class Rectangle {
    // stores first value of object rectangle as width double
    private double width;
    // stores second value of object rectangle as height double
    private double height;

    /**
     * The no-arg constructor
     *
     */
    public Rectangle() {
        width = 1;
        height = 1;
    }
    /**
     * the parameterized constructor
     * purpose: initialize the data members
     * @param width
     * @param height
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /**
     * getWidth method
     * @return width
     */
    public double getWidth() {
        return width;
    }
    /**
     * getHeight method
     * @return height
     */
    public double getHeight() {
        return height;
    }
    /**
     * setWidth method
     * purpose: set value of width
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * setHeight method
     * purpose: set value of height
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * getArea method
     * purpose: take height and width gets the area
     * @return area of a rectangle
     */
    public double getArea() {
        double area = width * height;
        return area;
    }
    /**
     * getPerimeter method
     * purpose: take height and wide adds them and multiply it by two to get the perimeter
     * @return perimeter of a rectangle
     */
    public double getPerimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }
}


