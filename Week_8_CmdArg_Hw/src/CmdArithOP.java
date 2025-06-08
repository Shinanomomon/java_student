/*
 *		 Auttapon boonlarp
 * 
 *		 6502041610047
 */
public class CmdArithOP {
	
	public static void main(String[] args ) {
		
		if (args.length !=3) {
			
			System.err.println("Usage: java cmd <n1> + <OP> + <n2>");
			System.err.println("nunber 1 and nunber 2 = double ");
			System.err.println("OP = Arithmetic Operations: ADD|SUB|MUL|DIV");
			
			System.exit(0);
		} double n1,n2;
		try {
			n1 = Double.parseDouble(args[0]);
			String cmd = new String(args[1]);
			n2 = Double.parseDouble(args[2]);
		
				
		if (cmd.equalsIgnoreCase("Add")) {

			System.out.printf("             Result : %.2f + %.2f = %.2f\n", n1, n2, n1+n2);}
		else if(cmd.equalsIgnoreCase("Sub")) {
			
			System.out.printf("             Result : %.2f - %.2f = %.2f\n", n1, n2, n1-n2);}
		else if(cmd.equalsIgnoreCase("Mul")) {
	
			System.out.printf("             Result : %.2f x %.2f = %.2f\n", n1, n2, n1*n2);}
		else if(cmd.equalsIgnoreCase("Div")) {
			
			if(n2 == 0) { System.err.println("Error : Division must not by zero");}
			else{System.out.printf("        Result : %.2f ÷ %.2f = %.2f\n", n1, n2, n1/n2);	}
		}
		else {
			System.err.println("Error :");
			System.err.println("How to Usage : CmdArithOP <Number> + <op> + <Number>");
			System.err.println("Arithmetic Operations is Add, Sub, Mul, Div");
		}
		}
		catch (Exception e)
		{
			System.err.println("Error :");
			System.err.println("How to Usage : CmdArithOP <Number> + <op> + <Number>");
			System.err.println("Arithmetic Operations is Add, Sub, Mul, Div");
			System.exit(0);
		}
		finally { System.out.println(" Thank you !!!"); }
	}
}