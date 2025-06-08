/*
 name : Khachaporn Lunthaiyo
 ID : 6502041620018
 Sect : CED 1 DERA
*/
public class ThreadCalculator extends Thread {
	private int[] score; 
	int sum =0;
	double mean =0;
	
	public ThreadCalculator() {
		super();
		this.sum = 0;
	}
	public ThreadCalculator(int[] score) { this.score = score; }
	public int getThreadscore() { return sum; }
	public double getMeanscore() { return mean; }
	
	@Override
	public void run() {
		this.sum = 0;
		for (int i=0; i<score.length; i++) {
			this.sum += score [i];
			}
		mean = (float)this.sum/score.length;
	}
}
	
