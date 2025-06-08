import java.util.Scanner;

public class MainTriangle {
	public static void main(String[] args) { 
		double b = 0;
		double h = 0;

	    try{
		    System.out.print("Enter Base number of Triangle: ");
		    Scanner sb = new Scanner(System.in);
		    b = sb.nextDouble();
		    System.out.print("Enter Height number of Triangle: ");
		    Scanner sh = new Scanner(System.in);
		    h = sh.nextDouble();
		    sh.close();
		    sb.close();
		}
		catch(DeraException De){
			System.err.println("CATCH in DeraException.");
			System.err.println(De);
		}
		catch(Exception e){
			System.err.println("CATCH in DeraException.");
			System.err.println(e);
		}
	    
	    
	
	    Triangle t = new Triangle(b,h);
		
	    System.out.println("===========================================================");
		System.out.println("                 Class Triangle");
		System.out.println("===========================================================");
		System.out.println("Side HEIGHT                    : " + t.getBase());
		System.out.println("Side BASE                      : " + t.getHeight());
		System.out.printf("Side C                         : %.2f\n",t.perimeter());
		System.out.println("TriangleArea                   : "+ t.triangleArea());
		System.out.printf("Perimeter                      : %.2f\n",(t.perimeter()+t.getBase()+t.getHeight()));
		System.out.println("===========================================================");
	}
}
