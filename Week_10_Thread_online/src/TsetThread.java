
public class TsetThread {

	public static void main(String[] args) {
		SimpleThread t1, t2, t3;
		t1 = new SimpleThread("T1");
		t2 = new SimpleThread("T2");
		t3 = new SimpleThread("T3");

		//Unblocked
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join(); t2.join(); t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		System.out.println("Main end:");
	}

}
