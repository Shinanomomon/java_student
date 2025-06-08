/*
 *Name :Naphaphon Klaimanee
 *ID : 6502041610080 
 */
import java.util.Scanner;
public class MainCircle{
	public static void main(String[] args) { 
		double num ;

	    System.out.print("Enter number of radius: ");
	    Scanner SC = new Scanner(System.in);
	    num = SC.nextDouble();
	    SC.close();
	
		Circle cl = new Circle(num);
		
		System.out.println("===========================");
		System.out.println("       Class Circle");
		System.out.println("===========================");
		System.out.println("Radius        : " + cl.getRadius());
		System.out.println("Diameter      : " + cl.getRadius() * 2);
		System.out.printf("Area          : %.2f\n", cl.computeArea());
		System.out.printf("Circumference : %.2f\n", cl.circumference());
		System.out.println("===========================");	
	}
}
