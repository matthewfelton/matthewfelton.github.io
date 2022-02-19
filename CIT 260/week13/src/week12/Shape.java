// Source code file for Shape Class
// Name: Matthew Felton
// Date last modified: 12/7/21
// Course: CIT-260


package week12;

public abstract class Shape {
    private String name;
    private int id;
    private int x;
    private int y;

    /**
     * no-arg Constructor
     */
    public Shape() {
        this.name = "None"; this.id = 0; this.x = 0; this.y = 0;
    }

    /**
     * Constructor
     * @param id
     */
    public Shape(String name, int id, int x, int y) {
        this.name = name; this.id = id; this.x = x; this.y = y;
    }

    /**
     * getName method
     * @return name
     */
    public String getName() { return name; }

    /**
     * setName method
     * @param name
     */
    public void setName(String name) { this.name = name; }
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
     * getId Method
     * @return id
     */
    public int getX() {
        return x;
    }
    /**
     * setId method
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }/**
     * getY Method
     * @return y
     */
    public int getY() {
        return y;
    }
    /**
     * setY method
     * @param y
     */
    public void setY(int y) {
        this.y = y;
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
        return getName() + " " + String.format("%4d", getId()) + "  (" + getX() + "," + getY() + ") ";
    }
}
