// Source code file for Shape Class
// Name: Matthew Felton
// Date last modified: 11/30/21
// Course: CIT-260


package week12;

public abstract class Shape {

    private int id;

    /**
     * no-arg Constructor
     */
    public Shape() {
        this.id = 0;
    }

    /**
     * Constructor
     * @param id
     */
    public Shape(int id) {
        this.id = id;
    }
    /**
     * getId Method
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * setId method
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * getArea Method
     * @return abstract/none
     */
    public abstract double getArea();
    /**
     * toString method
     * @return string of text
     */
    public String toString() {
        return getId() + " ";
    }
}
