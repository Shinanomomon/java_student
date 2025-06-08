public class Triangle implements Shape {

	@Override
	public void draw() {
 		System.out.println("Overriding method draw() in Triangle");
	}

		@Override
	public void erase() {
		System.out.println("Overriding method erase() in Triangle");
	}
}
