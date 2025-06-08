
public class Circle implements Shape {
		
		@Override
	public void draw() {
		System.out.println("Overriding method draw() in Circle");
	}

		@Override
	public void erase() {
		System.out.println("Overriding method erase() in Circle");
	}
}
