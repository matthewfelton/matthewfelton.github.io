// Source code file for circle Class
// Name: Matthew Felton
// Date last modified: 12/7/21
// Course: CIT-260


package week12;

public class Circle extends Shape {


    private double radius;

    /**
     * no-arg Constructor
     */
    public Circle() {

        this.radius = 0;
    }

    /**
     * Constructor
     * @param id
     * @param radius
     */
    public Circle(String name, int id, int x, int y, double radius) {
        super(name, id, x, y);
        this.radius = radius;
    }

    /**
     * getArea Method
     * @return abstract/none
     */
    @Override
    public double getArea(){
        return (radius * radius) * Math.PI;
    }
    /**
     * toString method
     * @return string of text
     */
    @Override
    public String toString() {
        return super.toString() + (String.format("%10.2f", getArea())) + " sq. inches";
    }
}
