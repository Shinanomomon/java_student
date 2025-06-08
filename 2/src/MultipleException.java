import java.io.*;
public class MultipleException {
	
	public static void main(String[] args) {
		int numerator = 10;
		int denominator = 10;
		int[] arr = new int[5];
		try {
			System.out.println("Numerator/Denominator = " + numerator/denominator);
			
			FileReader fr = new FileReader("C:\\test.txt");//.//divZero.java
			BufferedReader inputFile = new BufferedReader (fr);
			int x = inputFile.read();
			int a = arr[-1];
			inputFile.close();
		}
		catch (FileNotFoundException fnf) {
			System.err.println("CATCH in File Not Found Exception.");
			System.err.println(fnf);
		}
		catch (IOException ioe)	{
			System.err.println("CATCH in IO Exception.");
			System.err.println(ioe);
		}
		catch (ArrayIndexOutOfBoundsException arrex) {
			System.err.println("CATCH in ArrayIndexOutOfBoundsException.");
			System.err.println(arrex.getMessage());	
			System.err.println(arrex);
		}
		catch (ArithmeticException ae) {
			System.err.println("CATCH in ArithmeticException");
			System.err.println(ae.getMessage());
			System.err.println(ae);
		}
		catch (Exception e)	{
			System.err.println("CATCH in EXCEPTION");
			System.err.println(e.getClass());
		}
	}

}
