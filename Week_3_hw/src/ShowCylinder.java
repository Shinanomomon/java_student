/*
 *Name :Naphaphon Klaimanee
 *ID : 6502041610080 
 */
import java.util.Scanner;
public class ShowCylinder {
	public static void main(String[] args) {
		double radius,length;
		
		System.out.print("Enter number of radius : ");
		Scanner r = new Scanner(System.in);
		radius = r.nextDouble();
		
		System.out.print("Enter number of length : ");
		Scanner l = new Scanner(System.in);
		length = l.nextDouble();
		
		r.close();
		l.close();
		
		Cylinder rect = new Cylinder(radius,length);
		
		System.out.println("==============================");
		System.out.println("       Class Cylinder");
		System.out.println("==============================");
		System.out.println("Radius              : " + rect.getRadius());
		System.out.println("Diameter            : " + rect.getRadius() * 2);
		System.out.println("Length              : " + rect.getLength());
		System.out.printf("Area of Circle      : %.2f\n", rect.computeArea());
		System.out.printf("ComputeVolum        : %.2f\n", rect.computeVolume());
		System.out.printf("ComputeSurfaceArea  : %.2f\n", rect.computeSurfaceArea());
		System.out.println("==============================");	
	}
}