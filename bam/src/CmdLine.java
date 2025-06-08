/*
 * NAME:Khachaporn Lunthaiyo
 * ID:6502041620018
 * SECT:CED
 */

public class CmdLine {
	
	public static void main(String[] args ) {
		
		if (args.length !=2) {
			
			System.err.println("Usage: java  CmdLine  <OP>  <num>");
			System.err.println("Number   = double ");
			System.err.println("OP = Arithmetic Operations: sqrt|log|exp");
			
			System.exit(0);
		} double number;
		try {
			String cmd = new String(args[0]);
			number = Double.parseDouble(args[1]);
			
		if(number == 0) { System.err.println("Error : Number must not by zero");
			System.exit(0);}
		else if (number<0) {
			System.out.println("===================================================");
			System.err.println("   Change number "+number+" to "+Math.abs(number));
			number = Math.abs(number);
		}
				
		if (cmd.equalsIgnoreCase("sqrt")) {
		    System.out.println("===================================================");
		    System.out.println("            Square root of " +number);
			System.out.printf("             Answer is : %.2f \n", Math.sqrt(number));}
		else if(cmd.equalsIgnoreCase("log")) {
		    System.out.println("===================================================");
		    System.out.println("            Logarithm base 10 of " +number);
			System.out.printf("             Answer is : %.2f \n", Math.log10(number));}
		else if(cmd.equalsIgnoreCase("exp")) {
		    System.out.println("===================================================");
		    System.out.println("            Exponential of " +number);
			System.out.printf("             Answer is : %.2f \n ", Math.exp(number));}
		
		else {
			System.err.println("Error :");
			System.err.println("How to Usage : java  CmdLine <op> + <Number>");
			System.err.println("Arithmetic Operations is Sqrt, Log, Exp");
		}
		}
		catch (Exception e)
		{
			System.err.println("Error :");
			System.err.println("How to Usage : java  CmdLine <op> + <Number>");
			System.err.println("Arithmetic Operations is Sqrt, Log, Exp");
			System.exit(0);
		}
		finally { System.out.println("\n 	      Thank you !!!"); 
		    System.out.println("===================================================");}
	}
}