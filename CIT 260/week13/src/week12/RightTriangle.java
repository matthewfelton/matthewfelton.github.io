// Source code file for RightTriangle Class
// Name: Matthew Felton
// Date last modified: 12/7/21
// Course: CIT-260


package week12;

public class RightTriangle extends Shape {

    private double height;
    private double base;

    /**
     * no-arg Constructor
     */
    public RightTriangle() {

        this.height = 0;
        this.base = 0;
    }

    /**
     * Constructor
     * @param id
     * @param height
     * @param base
     */
    public RightTriangle(String name, int id, int x, int y, double height, double base) {
        super(name, id, x, y);
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
        return super.toString() + (String.format("%10.2f", getArea())) + " sq. inches";
    }
}
