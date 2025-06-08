/*
 * Name : Naphaphon Klaimanee
 * ID   : 6502041610080
 */
import java.util.Scanner;
public class TestCylinder {
	public static void main(String[] args) {
		double radius,length;

		System.out.print("Enter number of Radius : ");
		Scanner r = new Scanner(System.in);
		radius =r.nextDouble();
		
		System.out.print("Enter number of Length : ");
		Scanner l = new Scanner(System.in);
		length = l.nextDouble();
		
		r.close();
		l.close();
		
		if(radius==0) radius = 1.0;
		else if (radius<0) radius =radius * -1;
		 
		if(length==0) length = 1.0;
		else if(length<0) length =length * -1;
		
		Cylinder Cl = new Cylinder();
		
		System.out.println("==============================");
		System.out.println("  Class Interfeace Cylinder");
		System.out.println("==============================");
		System.out.println("Radius              : " + radius);
		System.out.println("Diameter            : " + radius * 2);
		System.out.println("Length              : " + length);
		System.out.println("PI                  : " + ICylinder.PI);
		System.out.printf("Area of Circle      : %.2f\n", Cl.Circle(radius));
		System.out.printf("Volum of Cylinder   : %.2f\n", Cl.volume(radius,length));
		System.out.printf("OpenSurfaceArea	    : %.2f\n", ICylinder.openSurfaceArea(radius, length));
		System.out.printf("CloseSurfaceArea    : %.2f\n", Cl.closeSurfaceArea(radius, length));
		System.out.println("==============================");	
	}

}
