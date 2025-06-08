
class TestAbstFood {
	public static void main(String args[]) {
		AbstFood pizza, chester, kfc;
	
		pizza = new ThePizza();
		callFood(pizza);
	
		chester = new Chester();
		callFood(chester);
	
		kfc = new KFC();
		callFood(kfc);
	}

	static void callFood(AbstFood obj) {
		obj.show();
		System.out.println(obj.call());
	}
}
