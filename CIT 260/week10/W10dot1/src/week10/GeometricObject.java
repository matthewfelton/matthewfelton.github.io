// Source code file for GeometricObject class
// Name: Matthew Felton
// Date last modified: 11/16/21
// Course: CIT-260



package week10;

public class GeometricObject {
    private String color ="white";
    private boolean filled;
    private java.util.Date created;

    /**
     * No Arg Constructor
     */
    public GeometricObject() {
        created = new java.util.Date();
        this.color = "white";
        this.filled = true;
    }

    /**
     * Constructor
     * @param color
     * @param filled
     */
    public GeometricObject(String color, boolean filled) {
        created = new java.util.Date();
        this.color = "white";
        this.filled = filled;
    }

    /**
     * getColor Method
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * getFilled Method
     * @return filled
     */
    public boolean getFilled() {
        return filled;
    }
    /**
     * created Method
     * @return created
     */
    public java.util.Date getCreated() {
        return created;
    }

    /**
     * setColor method
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * setFilled method
     * @param filled
     */
    public void SetFilled(String filled) {
        if (filled == "y") {
            this.filled = true;
        } else {
            this.filled = false;
        }




    }

    public String toString() {
        return "created on " + getCreated() +
                "\ncolor: " + getColor() + " and filled: " + getFilled();
    }
}
