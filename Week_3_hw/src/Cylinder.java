/*
 *Name :Naphaphon Klaimanee
 *ID : 6502041610080 
 */
public class Cylinder extends Circle {
	private double length;
	
	public Cylinder(){
		super();
	}
	
	public Cylinder(double r) {
		super(r);
		this.length =1.0;
		}
	
	public Cylinder(double r,double length) {
		super(r);
		this.setLength(length);
	}

	public void setLength(double length) {
		if(length==0)this.length=1.0;
		else this.length =Math.abs(length);
	}
	
	public double getLength() {return this.length;}
	
	public double computeVolume(){
		return super.computeArea()*this.length;
	}
	
	public double computeSurfaceArea() { 
		return (super.circumference()*length) + (super.computeArea()*2);
	}

	
}
