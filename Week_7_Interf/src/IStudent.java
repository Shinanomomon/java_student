
public interface IStudent {
	//field of interface: public static final automatically
	public static final int gen = 11;

	public abstract void sleep();//abstractไม่ใส่ก็ได้
	public void eat();
	public default void study() {
		System.out.println("We study very hard!!!");
	}
	public static void aboutMe() {
		System.out.println("We are CED#" + IStudent.gen);
	}
}
