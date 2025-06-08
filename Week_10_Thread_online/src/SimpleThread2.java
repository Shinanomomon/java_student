
public class SimpleThread2 implements Runnable {
	private String name;
	
	
	public SimpleThread2() {
		super();
		this.name = "Interface";
	}
	
	
	public SimpleThread2(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void run() {
		long delay=0;
		for(int i=0; i<10; i++) {
			delay = (long) (Math.random()*1000);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
			
			System.out.println(this.name + ": "+ i +"("+ delay +")");
		}

	}
}
