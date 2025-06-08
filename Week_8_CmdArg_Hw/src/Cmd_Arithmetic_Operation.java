/*
 * Name : Naphaphon Klaimanee
 * ID   : 6502041610080
 */

public class Cmd_Arithmetic_Operation {
	public static void main(String[] args) {
	try
	{
			if(args.length !=3) {
			System.err.println("Number of Argument must be 2.");
			System.err.println("Arithmetic Operations must be 1.");
			System.err.printf("Usage :");
			System.err.println("Cmd_Arithmetic_Operation <num1> <Arithmetic Operations> <num2>");
			System.err.println("Arithmetic Operations is Add, Sub(Subtract), Mul(Multiply), Div(Divide).");
			System.exit(0);
		}
		
		double num1,num2;

		num1 = Double.parseDouble(args[0]);
		String str = new String(args[1]);
		num2 = Double.parseDouble(args[2]);	
		

		if (str.equalsIgnoreCase("Add")) {System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1+num2);}
		else if(str.equalsIgnoreCase("Sub")) {System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);	}
		else if(str.equalsIgnoreCase("Mul")) {System.out.printf("%.2f x %.2f = %.2f\n", num1, num2, num1*num2);	}
		else if(str.equalsIgnoreCase("Div")) {System.out.printf("%.2f ÷ %.2f = %.2f\n", num1, num2, num1/num2);	}
		else {
			System.err.println("Number of Argument must be 2.");
			System.err.println("Arithmetic Operations must be 1.");
			System.err.printf("Usage :");
			System.err.println("Cmd_Arithmetic_Operation <num1> <Arithmetic Operations> <num2>");
			System.err.println("Arithmetic Operations is Add, Sub(Subtract), Mul(Multiply), Div(Divide).");
			System.exit(0);
			}
	}
	catch (Exception e)
	{
		System.err.println("Number of Argument must be 2.");
		System.err.println("Arithmetic Operations must be 1.");
		System.err.printf("Usage :");
		System.err.println("Cmd_Arithmetic_Operation <num1> <Arithmetic Operations> <num2>");
		System.err.println("Arithmetic Operations is Add, Sub(Subtract), Mul(Multiply), Div(Divide).");
	}
	finally
	{
		System.out.println("..............Thank you,For used it !!!.............");
		System.exit(0);
	}
	}
}
