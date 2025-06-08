
class TestAbstFood {
	public static void main(String args[]) {
		AbstFood pizza, chester, kfc;
	
	/*	AbstFood x;
		x = new Chester();
		callFood(x);
	//
		AbstFood x;
		x = new KFC();
		callFood(x);
	//
		AbstFood x;
		x = new ThePizza();
		callFood(x);
	*/	
		pizza = new ThePizza();
		callFood(pizza);
	
		chester = new Chester();
		callFood(chester);
	
		kfc = new KFC();
		callFood(kfc);
	/*ใช้ได้*/
	}

	static void callFood(AbstFood obj) {
		obj.show();
		System.out.println(obj.call());
	}
}
