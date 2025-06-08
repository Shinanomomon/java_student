/*
 name : Khachaporn Lunthaiyo
 ID : 6502041620018
 Sect : CED 1 DERA
*/
// Add name, ID, section here
import java.lang.Math;
public class Triangle {
    // Private properties
    private double base;
    private double height;

    // Constructor
	public Triangle() {
		this.base = 1.0;
		this.height = 1.0;
	}
    public Triangle(double base, double height) throws DeraException {
        setBase(base);
        setHeight(height);
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setBase(double base) throws DeraException {
        if (base <= 0) {
        	DeraException De = new DeraException();
			throw  De;
        } else {
        	this.base = Math.abs(base);
        }
    }

    public void setHeight(double height) throws DeraException {
        if (height <= 0) {
        	DeraException De = new DeraException();
			throw  De;
        } else {
        	this.height = Math.abs(height);
        }
    }

    // Method to calculate area
    public double triangleArea() {
        return (base * height) / 2;
    }

    // Method to calculate perimeter (assuming equilateral triangle for simplicity)
    public double perimeter() {
        double side = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.height, 2));
        return side;
    }


}