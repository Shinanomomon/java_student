/*
 name : Khachaporn Lunthaiyo
 ID : 6502041620018
 Sect : CED 1 DERA
*/
public class TriangularPrism extends Triangle{
	private double length ;
	public TriangularPrism() {
		super();
	}
	
	public TriangularPrism(double base,double height,double length) {
		super(base,height);
		this.setLength(length);
	}
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length==0)this.length=1.0;
		else this.length =Math.abs(length);
	}
	public double Volume(){
		return super.triangleArea()*this.length;
	}
	public double SurfaceArea() { 
		return (super.getBase()*length)+(super.getHeight()*length)+(super.perimeter()*length) + (super.triangleArea() *2);
	}
}