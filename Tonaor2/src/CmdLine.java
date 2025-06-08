/*
 *Name : Poranat Tonthakaew
import java.util.Scanner;
*/
public class CmdLine {
	public static void main(String[] args ) {
		
		if (args.length !=2) {
			System.err.println("Usage: java  CmdLine  <AOP>  <number>");
			System.err.println("Number   = Double ");
			System.err.println("AOP = Arithmetic Operations: SQET|LOG|EXP");
			System.exit(0);} 
		
		double n;
		
		try {
			String cmd = new String(args[0]);
			n = Double.parseDouble(args[1]);
		if(n == 0) { System.err.println("Error : Number must not  zero");
			System.exit(0);}
		else if (n<0) {
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.err.println("   Change number"+n+" to "+Math.abs(n));
			System.err.println("   Because number can't nagative");
			n = Math.abs(n);}
				
		if (cmd.equalsIgnoreCase("sqrt")) {
		    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		    System.out.printf("                  Square root of %.2f\n",n);
			System.out.printf("                  Result : %.2f \n", Math.sqrt(n));}
		else if(cmd.equalsIgnoreCase("log")) {
		    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		    System.out.printf("                  Logarithm base 10 of %.2f\n",n);
			System.out.printf("                  Result : %.2f \n", Math.log10(n));}
		else if(cmd.equalsIgnoreCase("exp")) {
		    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		    System.out.printf("                  Exponential of %.2f\n",n);
			System.out.printf("                  Result : %.2f \n ", Math.exp(n));}
		else {
			System.err.println("Error : error is");
			System.err.println("How to Usage : java  CmdLine <Aop> + <number>");
			System.err.println("Arithmetic Operations is SQET, LOG, EXP");}}
		
		catch (Exception err) {
			System.err.println("Error : error is");
			System.err.println("How to Usage : java  CmdLine <Aop> + <number>");
			System.err.println("Arithmetic Operations is SQET, LOG, EXP");
			System.exit(0);}
		
		finally { 
			System.out.println("\n      !!!!!      Thank you for used me too      !!!!"); 
		    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");}
	}
}