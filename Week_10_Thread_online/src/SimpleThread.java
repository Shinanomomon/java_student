
public class SimpleThread extends Thread {
	//private int x;
	//private int[] y;
	public SimpleThread() {
		super();
	}
	public SimpleThread(String name) {
		super(name);
	}
	
	public void run() {// main() of Thread
		long delay=0;
		for(int i=0;i<10;i++) {
			delay = (long) Math.random()*1000;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(super.getName() + ": " + i + "(" + delay + ")");
		}
		
	}
}
