/*
 *Name : Poranat Tonthakaew
import java.util.Scanner;
*/
import java.util.Scanner;

public class MainTriangle {
	public static void main(String[] args) { 
	double base = 0;
	double height = 0 ;
    try{
    	System.out.print("Enter Height number of Triangle: ");
    	Scanner hg = new Scanner(System.in);
    	height = hg.nextDouble();
    	System.out.print("Enter Base number of Triangle: ");
    	Scanner bs = new Scanner(System.in);
    	base = bs.nextDouble();

    	hg.close();
    	bs.close();
    }
	catch(DeraException Dera){
		System.err.println("CATCH in DeraException.");
		System.err.println(Dera);
	}
	catch(Exception e){
		System.err.println("CATCH in DeraException.");
		System.err.println(e);
	}
    Triangle tg = new Triangle(base,height);
	
    System.out.println("================================");
	System.out.println("       Class Triangle");
	System.out.println("================================");
	System.out.println("Side A         : " + tg.getBase());
	System.out.println("Side B         : " + tg.getHeight());
	System.out.printf("Side C         : %.2f\n",tg.perimeter());
	System.out.println("TriangleArea   : "+ tg.triangleArea());
	System.out.printf("Perimeter      : %.2f\n",(tg.perimeter()+tg.getBase()+tg.getHeight()));

	System.out.println("================================");
	}
}
