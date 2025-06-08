public class Store {
	static ProductInfo baja, java;
	
	public static void main(String[] args) {
		init();
		orderInfo(baja, 1);
		
		System.out.println("-----------------------------");
		
		orderInfo(java, 2);		
	}
	
	static void init()
	{
		baja = new Shoes();
		java = new Books();
	}
	
	static void orderInfo(ProductInfo item, int id)
	{
		item.showName();
		System.out.println("To order from " + item.MAKER + 
				" call " + item.PHONE);
		System.out.println("Each item costs " + item.getPrice(id));
	}

}
