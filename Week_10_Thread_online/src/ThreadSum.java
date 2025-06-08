
public class ThreadSum extends Thread {
	private int[] score; 
	int sum = 0;
	
	public ThreadSum() {
		super();
		this.sum = 0;
	}
	public ThreadSum(int[] score) {
		this.score = score;
	}
	public int getSum() {
		return sum;
	}
	
	public void run() {
		this.sum = 0 ;
		for (int i=0; i<score.length; i++)
			this.sum += score [i];
		System.out.println(super.getName()+ " is done.(" + this.sum + ")");
	}
	
	
}
