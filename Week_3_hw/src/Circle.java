/*
 *Name :Naphaphon Klaimanee
 *ID : 6502041610080 
 */
public class Circle {

	private double Radius;
	double Pi = Math.PI;
	
	public Circle() {this.Radius = 1.0;}
	
	public Circle(double radius) {this.setRadius(radius);}
	
	public void setRadius(double radius) {
		if(radius==0) this.Radius = 1.0;
		else if (radius<0) this.Radius =radius * -1;
		else this.Radius = radius;
	}
	
	public double getRadius() {return this.Radius;}
	
	public double computeArea() {return this.Pi * this.Radius * this.Radius;}
	
	public double circumference() {return 2 * this.Pi * this.Radius;}
}

