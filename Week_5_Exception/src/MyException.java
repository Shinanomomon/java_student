
public class MyException extends Exception {

	private static final long serialVersionUID = 356993750L;

	public MyException()//default Constructor
	{
		System.out.println("***** myException's Default Construction *****");
	}
	
	MyException(int i)
	{
		System.out.println("Construct's parameter: " + i);
	}
	
	public void display()
	{
		System.out.println("***** display method in myException *****");
	}
}
