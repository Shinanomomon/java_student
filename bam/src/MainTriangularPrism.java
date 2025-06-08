/*
 name : Khachaporn Lunthaiyo
 ID : 6502041620018
 Sect : CED 1 DERA
*/
import java.util.Scanner;
public class MainTriangularPrism{
	public static void main(String[] args) { 
		double b;
		double h;
		double l;

	    System.out.print("Enter Height number of Triangle: ");
	    Scanner sh = new Scanner(System.in);
	    b = sh.nextDouble();
	    System.out.print("Enter Base number of Triangle: ");
	    Scanner sb = new Scanner(System.in);
	    h = sb.nextDouble();
	    System.out.print("Enter Length number of Triangle: ");
	    Scanner sl = new Scanner(System.in);
	    l = sl.nextDouble();
	    
	    sl.close();
	    sh.close();
	    sb.close();
	
	    TriangularPrism t = new TriangularPrism(b,h,l);
		
	    System.out.println("===========================================================");
		System.out.println("                 Class TriangularPrism");
		System.out.println("===========================================================");
		System.out.println("Side HEIGHT                    : " + t.getBase());
		System.out.println("Side BASE                      : " + t.getHeight());
		System.out.printf("Side C                         : %.2f\n",t.perimeter());
		System.out.printf("LENGTH                         : %.2f\n",t.getLength());
		System.out.println("TriangleArea                   : "+ t.triangleArea());
		System.out.printf("Perimeter                      : %.2f\n",(t.perimeter()+t.getBase()+t.getHeight()));
		System.out.println("Volume of TriangularPrism      : "+t.Volume());
		System.out.printf("SurfaceArea of TriangularPrism : %.2f\n",t.SurfaceArea());
		System.out.println("===========================================================");
	}
}

