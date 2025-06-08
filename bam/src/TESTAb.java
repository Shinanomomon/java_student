/*
 name : Khachaporn Lunthaiyo
 ID : 6502041620018
 Sect : CED 1 DERA
*/
import java.util.Scanner;

public class TESTAb {
	public static void main(String[] args) { 
		try{
		int x;
		int y;
		System.out.println("number use to Add Subtract and Multiply ");
	    System.out.print("Enter number of X: ");
	    Scanner XN = new Scanner(System.in);
	    x = XN.nextInt();
	    System.out.print("Enter number of Y: ");
	    Scanner YN = new Scanner(System.in);
	    y = YN.nextInt();	
  

	    int Dx;
		int Dy;
	    System.out.println("number use to Divide");
	    System.out.print("Enter number of X: ");
	    Scanner DXN = new Scanner(System.in);
	    Dx = DXN.nextInt();
	    System.out.print("Enter number of Y: ");
	    Scanner DYN = new Scanner(System.in);
	    Dy = DYN.nextInt();

	    XN.close();
	    YN.close();
	    DXN.close();
	    DYN.close();
	    
	    Abstract AB = new Abstract();
		
	    System.out.println("-------------------------------------------");
		System.out.println("       Class " + IArith.dept);
		System.out.println("-------------------------------------------");
		System.out.println("Dept            : " + IArith.dept);
		System.out.println("number of X   : " + x);
		System.out.println("number of Y   : " + y);	
		System.out.println("Add           : " + AB.add(x,y));
		System.out.println("Subtract      : " + IArith.subtract(x, y));
		System.out.println("Multiply      : " + AB.multiply(x,y));
		if(Dx==0||Dy==0){
			System.err.println("Divide        : Can't Divide by Zero");
			}
		else{
			System.out.println("Divide        : " + AB.divide(Dx,Dy));}
			System.out.println("-------------------------------------------");
	    	}
		catch(Exception err) {
			System.err.println("-------------------------------------------");
			System.err.println("      !!!Please in put Number!!!");
			System.err.println("   "+err);
			System.err.println("-------------------------------------------");

		}
	}
}
