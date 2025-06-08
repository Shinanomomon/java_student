/*
 * Name : Naphaphon Klaimanee
 * ID   : 6502041610080
 */
public class Score extends Thread {
	private int[] score;
	private double sum = 0;
	
	public Score() {super();}
	public Score(int[] score) {this.score =score;}
	
	public int[] getScore() {return score;}
	public void setScore(int[] score) {this.score = score;}
	public double getSum() {return this.sum;}
	
	public void run() {
		for(int i=0;i<score.length; i++) {
			this.sum += score[i];
		}
		double avg = this.sum/this.score.length;
		System.out.printf("\nSum of "+super.getName()+" is : "+this.sum);
		System.out.printf("\nLength of "+super.getName()+" is : "+score.length);
		System.out.printf("\nAverage of "+super.getName()+" is : %.2f",avg);
		System.out.printf("\n"+super.getName()+" is done.");
	}
	
}
