// Source code file for circle Class
// Name: Matthew Felton
// Date last modified: 11/30/21
// Course: CIT-260


package week12;

public class Circle extends Shape {

    private int id;
    private double radius;

    /**
     * no-arg Constructor
     */
    public Circle() {
        this.id = 0;
        this.radius = 0;
    }

    /**
     * Constructor
     * @param id
     * @param radius
     */
    public Circle(int id, double radius) {
        super(id);
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
        return super.toString() + (String.format("%13.2f", getArea())) + " sq. inches";
    }
}
