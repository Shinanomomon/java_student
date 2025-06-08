/***
 * @author Soradech Krootjohn
 */
public interface ICylinder {
	public static final double PI = 3.14159;
	
	public double volume(double radius, double length);
	
	public static double openSurfaceArea(double r, double l) {
		return 2 * ICylinder.PI * r * l;
	}
	
	public double closeSurfaceArea(double r, double l);
}

