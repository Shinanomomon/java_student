public class InterfPoly {
	public static void main(String args[]) {
		Shape obj1, obj2, obj3;
		obj1 = new Circle();
		obj2 = new Square();
		obj3 = new Triangle();
	
		run(obj1);	
		run(obj2);	
		run(obj3);	
	}

	static void run(Shape obj) {
		System.out.println("Polymorphism Method");
		obj.draw();
		obj.erase();
	}
}
