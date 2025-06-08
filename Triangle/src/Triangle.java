/*
 *Name : Poranat Tonthakaew
 *ID : 6502041610021 
 *Sect : CED 1 DERA
 */
import java.lang.Math;
public class Triangle {
	
	private double base  ;
	private double height ;
	double pow = 2 ;
	double c ;
	
	public Triangle() {
		this.base = 1.0;
		this.height = 1.0;
	}
	
	public Triangle(double base,double height) throws DeraException {
		this.setBase(base);
		this.setHeight(height);
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) throws DeraException {
		if (base <= 0) {
        	DeraException Dera = new DeraException();
			throw  Dera;
        } else {
        	this.base = Math.abs(base);
        }
	}
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) throws DeraException {
		if (height <= 0) {
        	DeraException Dera = new DeraException();
			throw  Dera;
        } else {
        	this.height = Math.abs(height);
        }
	}
	
	public double triangleArea() {
		return ((this.height*this.base)/2);
	}
	
	public double perimeter() {
		return Math.sqrt(Math.pow(this.base, pow) + Math.pow(this.height, pow));
	}
	
}
