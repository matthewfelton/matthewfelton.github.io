// Source code file for MyPoint class
// Name: Matthew Felton
// Date last modified: 11/9/21
// Course: CIT-260



package week09;

public class MyPoint {
    // private data ints
    private int x;
    private int y;
    /**
     * no-arg constructor
     *
     */
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    /**
     * parameterized constructor
     * purpose: intialize the data members
     * @param x
     * @param y
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * getX method
     * @return x
     */
    public int getX() {
        return x;
    }
    /**
     * getY method
     * @return y
     */
    public int getY() {
        return y;
    }
    /**
     * setX Method
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * setY method
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * distance method (by coords)
     * A member method named distance that calculates and returns the distance between this
     * MyPoint object and another point that is specified by its x- and y-coordinates.
     * @param xCoord
     * @param yCoord
     * @return dist
     */
    public double distance(int xCoord, int yCoord) {
        double dist = Math.sqrt(Math.pow((x - xCoord), 2)
                + Math.pow((y- yCoord), 2));
        return dist;
    }
    /**
     *  distance method (by class object)
     *  A member method named distance that calculates and
     *  returns the distance between this MyPoint object and another object of the MyPoint class.
     * @param p
     * @return dist
     */
    public double distance(MyPoint p) {
        double dist = Math.sqrt(Math.pow((x - p.x), 2)
                + Math.pow((y - p.y), 2));
        return dist;
    }

    /**
     * distance method ( by two class object)
     * A static method named distance that takes two objects of the MyPoint class as parameters,
     * and calculates and returns the distance between the two of them.
     * @param mp1
     * @param mp2
     * @return dist
     */
    public static double distance (MyPoint mp1, MyPoint mp2) {
        double dist = Math.sqrt(Math.pow((mp1.x - mp2.x), 2)
                + Math.pow((mp1.x -mp2.y), 2));
        return dist;
    }
}