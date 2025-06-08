/***
 * @author Soradech Krootjohn
 */
public interface IArith {
	public static final String dept = "Computer Education";
	
	public default int add(int x, int y) {
		return x + y;
	}
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	// Abstract Methods
	public int multiply(int x, int y); // You CANNOT use * operator to calculate
	public double divide(double x, double y); 
}