
public class InterfaceCircle {
	
	public static void main(String args[]) {
		IntfCircle cir = new MyCircle(5.3);

		cir.showArea();

		double area = cir.findArea();
		System.out.println("Area = " + area);
	}
}
