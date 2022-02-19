// Source code file for Square Class
// Name: Matthew Felton
// Date last modified: 12/7/21
// Course: CIT-260


package week12;

public class Square extends Shape {

    private double side;

    /**
     * no-arg Constructor
     */
    public Square() {

        this.side = 0;
    }

    /**
     * Constructor
     * @param id
     * @param side
     */
    public Square(String name, int id, int x, int y, double side) {
        super(name, id, x, y);
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
        return super.toString() + (String.format("%10.2f", getArea())) + " sq. inches";
    }
}
