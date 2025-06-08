
public class Shoes implements ProductInfo {
	public double getPrice(int id)
	{
		if(id==1)
			return (750);
		else
			return (1000);
	}
	
	public void showName()
	{
		System.out.println("I'm a pair of shoes.");
	}
}
