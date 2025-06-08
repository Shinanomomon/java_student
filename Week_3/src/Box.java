/*
 *Name :Naphaphon Klaimanee
 *ID : 6502041610080 
 */
public class Box extends Rectangle {
	//Property
	private double depth;
	
	//Constructor
	public Box() {//Default Constructor
		/*super.setHeight(1);=.=ใช้ได้เพราะสืบทอด
		super.setHeight(1);
		super.name ="CED box";
		*/
		super(); //call default Constructor of superclass
		this.depth = 1;
		}
	public Box(double width, double height, double depth) {//overloading Constructor
		super (width, height);
		this.setDepth(depth);
	}
	public Box(double width, double height, double depth,String name) {//overloading Constructor
		super (width, height, name);
		this.setDepth(depth);
	}
	
	//setter
	public void setDepth(double depth) {
		if(depth==0) this.depth =1.0;
		else this.depth = Math.abs(depth);	
	}
	public void setSize(double width, double height, double depth) { //overloading method
		//super.setWidth(width);
		//super.setHeight(height);
		super.setSize(width, height);
		//this.setSize(width, height);
		this.setDepth(depth);
	}
	
	//Getter
	public double getDepth() {return this.depth;}
	
	
	public double computeVolum() {
		
		/*double volume = super.setWidth() * super.setHeight() * this.depth;
		return volume;
		
		//return super.setWidth()* super.setHeight()*this.depth;
		
		*/
		return super.computeArea() * this.depth;
		}
	
	public void displayDetail () {//overriding method
		System.out.println("===========================");
		System.out.println("        class Box");
		System.out.println("===========================");
		System.out.println("Width  : " + super.getWidth());
		System.out.println("Height : " + super.getHeight());
		System.out.println("Depth  : " + this.depth);
		System.out.println("Name   : " + super.name);
		System.out.println("Volum  : " + this.computeVolum());
	}
}
