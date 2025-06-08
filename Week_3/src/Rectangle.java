/*
 *Name :Naphaphon Klaimanee
 *ID : 6502041610080 
 */
public class Rectangle {
	// Properties = width and height
	private double width; //protected=private== ลูกใช้ได้
	private double height;
	protected String name;

	//Method
	// constructor //not: void but don't return ,name is class name
	public  Rectangle(){// Default Constructor
		System.out.println("--------------------- CED !!!!!!!!! ----------------");
		this.width  = 1.0;
		this.height = 1.0;
		this.name = "CED";
	}
	public  Rectangle(double width,double height) { //overloading Constructor
		this.setSize(width,height);
		this.name = "CED-Overload";
	}
	public  Rectangle(double width,double height,String name) { //overloading Constructor
		this.setWidth(width);
		this.setHeight(height);
		this.name = name;
	}
	//setter
	public void setWidth(double width) {
		if(width==0) this.width =1.0;
		else if (width<0) this.width =width * -1;
		else this.width = width;
	}
	public void setHeight(double height) {
		if(height==0) this.height = 1.0;
		else this.height = Math.abs(height);//math.abs=แอปสรูต
	}
	public void setSize(double width,double height) {
		this.setWidth(width);
		this.setHeight(height);
	}
	//Getter
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	
	
	public double computeArea() {
		/*
		 * double area = 0.0;
		 * area = width * height
		 * return area
		 * */
		return this.width * this.height; //times(ฝร่งใช้พูด) = *
	}
	public void displayDetail () {
		System.out.println("===========================");
		System.out.println("     class Rectangle");
		System.out.println("===========================");
		System.out.println("Width  : " + this.width);
		System.out.println("Height : " + this.height);
		System.out.println("Name   : " + this.name);
		System.out.println("Area   : " + this.computeArea());
	}
	
}
