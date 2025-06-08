
public class TestThread2 {

	public static void main (String[] args) {
		//Create Object of Runnable 
		SimpleThread2 x1, x2, x3; 
		x1 = new SimpleThread2("X1");
		x2 = new SimpleThread2("X2");
		x3 = new SimpleThread2("X3");
		
		//Create Object of Thread 
		Thread t1 = new Thread(x1, "T1");
		Thread t2 = new Thread(x2, "T2");
		Thread t3 = new Thread(x3, "T3");
		
		//Start Thread 
		t1.start();
		t2.start();
		t3.start();
		
 		try {
			t1.join();
			t2.join();
			t3.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main End :");
		
	}
}
