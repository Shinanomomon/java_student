/*
 * Name : Naphaphon Klaimanee
 * ID   : 6502041610080
 */
public class Cylinder implements ICylinder {

	public double Circle(double radius) {
		return (ICylinder.PI*radius*radius);
	}

	@Override
	public double volume(double radius, double length) {
		return (ICylinder.PI*radius*radius)*length;
	}

	@Override
	public double closeSurfaceArea(double r, double l) {
		return (ICylinder.PI*r*r)*2 + (2*ICylinder.PI*r)*l;
	}


}
