/*
 *Name : Poranat Tonthakaew
 *ID : 6502041610021 
 *Sect : CED 1 DERA
 */
public class ThrreadScore extends Thread {
	private int[] score; 
	int sum = 0;
	double Means = 0 ;
	
	public ThrreadScore() {
		super();
		this.sum = 0;
	}
	public ThrreadScore(int[] score) {
		this.score = score;
	}
	public int getThreadscore() {
		return sum;
	}
	public double getMeanscore() {
		return Means;
	}
	@Override
	public void run() {
		this.sum = 0 ;
		for (int i=0; i<score.length; i++) this.sum += score [i];
		Means = (this.sum/(float)score.length) ;
	}
}
	
