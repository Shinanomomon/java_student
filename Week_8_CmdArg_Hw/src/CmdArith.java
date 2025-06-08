/*
 * Name : Naphaphon Klaimanee
 * ID   : 6502041610080
 */

public class CmdArith {

	public static void main(String[] args) {
				if(args.length !=3) {
				System.err.println("Error :");
				System.err.println("How to Usage : CmdArith <Number> <Arithmetic Operations> <Number>");
				System.err.println("Arithmetic Operations is Add, Sub(Subtract), Mul(Multiply), Div(Divide).");
				System.err.println("\n                       ==> Plsase try again. <==");
				System.exit(0);
			}
		try {
			double num1 = Double.parseDouble(args[0]);
			String str = new String(args[1]);
			double num2 = Double.parseDouble(args[2]);	

			if (str.equalsIgnoreCase("Add")) {
				System.out.println("========================================================");
				System.out.printf("             Result : %.2f + %.2f = %.2f\n", num1, num2, num1+num2);}
			else if(str.equalsIgnoreCase("Sub")) {
				System.out.println("========================================================");
				System.out.printf("             Result : %.2f - %.2f = %.2f\n", num1, num2, num1-num2);}
			else if(str.equalsIgnoreCase("Mul")) {
				System.out.println("========================================================");
				System.out.printf("             Result : %.2f x %.2f = %.2f\n", num1, num2, num1*num2);}
			else if(str.equalsIgnoreCase("Div")) {
				if(num2 == 0) { 
				System.err.printf("Result : %.2f ÷ %.2f <== \n", num1, num2);
				System.err.println("Error : Division must not by zero");
				System.exit(0);
				}
				else{
				System.out.println("========================================================");
				System.out.printf("        Result : %.2f ÷ %.2f = %.2f\n", num1, num2, num1/num2);	
				}
			}
			else {
				System.err.println("Error :");
				System.err.println("How to Usage : CmdArith <Number> <Arithmetic Operations> <Number>");
				System.err.println("Arithmetic Operations is Add, Sub(Subtract), Mul(Multiply), Div(Divide).");
				System.err.println("\n                       ==> Plsase try again. <==");
				System.exit(0);
				}
			System.out.println("========================================================");
		}
		catch (Exception e)
		{
			System.err.println("Error :");
			System.err.println("How to Usage : CmdArith <Number> <Arithmetic Operations> <Number>");
			System.err.println("Arithmetic Operations is Add, Sub(Subtract), Mul(Multiply), Div(Divide).");
			System.err.println("\n                       ==> Plsase try again. <==");
			System.exit(0);
		}
		finally { System.out.println("\n................Thank you,For used it !!!..............."); }
	}

}
