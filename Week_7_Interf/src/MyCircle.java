
public class MyCircle implements IntfCircle {
	private double r;// property

	public MyCircle() {
		this.r = 1.0;
	}
	public MyCircle(double r) {
		this.r = r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	
	public double getR() {
		return r;
	}

		@Override
	public double findArea() {
		return PI * this.r * this.r; //IntfCIrcle.PI ใช้ได้แบบตัวเต็ม
	}
	
		@Override
	public void showArea() {
		System.out.println("Radius: " + r);
		System.out.println("Circle area: " + this.findArea()); 
	}
}
