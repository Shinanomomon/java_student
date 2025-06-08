
public class Books implements ProductInfo{
	public double getPrice(int id)
	{
		if(id==1)
			return (250);
		else
			return (300);
	}
	
	public void showName()
	{
		System.out.println("I'm a book.");
	}
}
