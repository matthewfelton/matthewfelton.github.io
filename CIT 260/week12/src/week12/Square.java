// Source code file for Square Class
// Name: Matthew Felton
// Date last modified: 11/30/21
// Course: CIT-260


package week12;

public class Square extends Shape {
    private int id;
    private double side;

    /**
     * no-arg Constructor
     */
    public Square() {
        this.id = 0;
        this.side = 0;
    }

    /**
     * Constructor
     * @param id
     * @param side
     */
    public Square(int id, double side) {
        super(id);
        this.side = side;
    }

    /**
     * getArea Method
     * @return abstract/none
     */
    @Override
    public double getArea(){
        return side * side;
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
