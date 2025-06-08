
public class TestCED {

	public static void main(String[] args) {
	CEDStudent std = new CEDStudent();
	
	std.sleep();
	std.eat();
	std.study();//use default
	IStudent.aboutMe();//use static
	
	System.out.println("Gen = " + IStudent.gen);
	}

}
