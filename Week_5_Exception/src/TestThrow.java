
public class TestThrow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			myThrow(-1);
		}
		catch(MyException mye)
		{
			System.err.println("CATCH in myException.");
			System.err.println(mye);
		}
		catch(Exception e)
		{
			System.err.println("CATCH in Exception.");
			System.err.println(e);
		}
	}

	static void myThrow(int x) throws MyException
	{
		if(x<=0)
		{
			MyException mye = new MyException();
			throw  mye;//new MyException();
		}
		System.out.println("------------------");
		System.out.println("  x = " + x);
		System.out.println("------------------");
	}

}
