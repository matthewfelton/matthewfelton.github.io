// Source code file for Employee Class
// Name: Matthew Felton
// Date last modified: 11/23/21
// Course: CIT-260


package week11;

public class Employee {
    private String name;
    private int serialNumber;

    /**
     * No-arg Constructor
     */
    public Employee() {
        this.name = "none";
        this.serialNumber = 0;
    }
    /**
     * arg Constructor
     * @param name
     * @param id
     */
    public Employee(String name, int id) {
        this.name = name;
        this.serialNumber = id;
    }

    /**
     * getName Method
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * getId Method
     * @return id
     */
    public int getId() {
        return serialNumber;
    }
    /**
     * setName Method
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * setId Method
     * @param id
     */
    public void setId(int id) {
        this.serialNumber = id;
    }

    /**
     * getGross Pay Parent method
     * @return 0
     */
    public double getGrossPay() {
        return 0;
    }
    /**
     * getFedWithholding Pay Parent method
     * @return 0
     */
    public double getFedWithholding() {
        return 0;
    }
    /**
     * getStateWithholding Pay Parent method
     * @return 0
     */
    public double getStateWithholding() {
        return 0;
    }
    /**
     * toString method parent
     * @return string containing name and serial number
     */
    @Override
    public String toString() {
        return "Employee: " + getName() + " Serial: " + getId();
    }

}
