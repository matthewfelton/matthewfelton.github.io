// Source code file for RightTriangle Class
// Name: Matthew Felton
// Date last modified: 11/30/21
// Course: CIT-260


package week12;

public class RightTriangle extends Shape {
    private int id;
    private double height;
    private double base;

    /**
     * no-arg Constructor
     */
    public RightTriangle() {
        this.id = 0;
        this.height = 0;
        this.base = 0;
    }

    /**
     * Constructor
     * @param id
     * @param height
     * @param base
     */
    public RightTriangle(int id, double height, double base) {
        super(id);
        this.height = height;
        this.base = base;
    }

    /**
     * getArea Method
     * @return abstract/none
     */
    @Override
    public double getArea(){
        return (height * base) / 2;
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
