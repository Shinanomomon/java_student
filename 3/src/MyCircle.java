
public class MyCircle implements IntfCircle {
	private double r;

	public MyCircle(double r) {
		this.r = r;
	}

	public double findArea() {
		return PI * this.r * this.r;
	}

	public void showArea() {
		System.out.println("Radius: " + r);
		System.out.println("Circle area: " + this.findArea()); 
	}
}
