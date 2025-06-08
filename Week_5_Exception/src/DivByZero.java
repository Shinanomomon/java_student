
public class DivByZero {
	public static void main(String args[ ]) {
		int numerator = 10;
		int denominator = 10;
		try {
			System.out.println("Numerator/Denominator = " + numerator/denominator);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Result: 0");
			System.err.println("CATCH in ArithmeticException");
			System.err.println(ae);
		}
		catch (Exception e) {
			System.err.println("CATCH in Exception");
			System.err.println(e);
		}
		finally {
			System.err.println("======== Finally ========");
			
		}

	}//End of main
}
