/*
 *Name : Poranat Tonthakaew
 *ID : 6502041610021 
 *Sect : CED 1 DERA
 */
import java.util.Scanner;
public class MainTriangularPrism{
	public static void main(String[] args) { 
		double base ;
		double height;
		double length;

	    System.out.print("Enter Height number of Triangle: ");
	    Scanner hg = new Scanner(System.in);
	    base = hg.nextDouble();
	    System.out.print("Enter Base number of Triangle: ");
	    Scanner bs = new Scanner(System.in);
	    height = bs.nextDouble();
	    System.out.print("Enter Length number of Triangle: ");
	    Scanner ls = new Scanner(System.in);
	    length = ls.nextDouble();
	    
	    ls.close();
	    hg.close();
	    bs.close();
	
	    TriangularPrism tg = new TriangularPrism(base,height,length);
		
	    System.out.println("================================");
		System.out.println("       Class TriangularPrism");
		System.out.println("================================");
		System.out.println("Side A         : " + tg.getBase());
		System.out.println("Side B         : " + tg.getHeight());
		System.out.printf("Side C         : %.2f\n",tg.perimeter());
		System.out.printf("length         : %.2f\n",tg.getLength());
		System.out.println("TriangleArea   : "+ tg.triangleArea());
		System.out.printf("Perimeter      : %.2f\n",(tg.perimeter()+tg.getBase()+tg.getHeight()));
		System.out.println("Volume of TriangularPrism: "+tg.Volume());
		System.out.printf("SurfaceArea of TriangularPrism : %.2f\n",tg.SurfaceArea());
		System.out.println("================================");
	}
}
