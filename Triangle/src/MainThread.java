import java.util.Arrays;

/* Soradech Krootjohn
 * TCT-RA
 */
public class MainThread {
	public static void main(String[] args) {
		int[] score = new int[300000];
		init(score);
		
		// write your code here
		// (send score[0]-score[99999] to Thread1
		// (send score[100000]-score[199999] to Thread2
		// (send score[200000]-score[299999] to Thread3
		
		int numThread = 3;
		ThrreadScore[] t = new ThrreadScore[numThread];
		
		for(int i=0; i<numThread; i++) {
			int start=0, end=99999;
			start = start+(i*100000);
			end = end+(i*100000);
			t[i] = new ThrreadScore(Arrays.copyOfRange(score, start, end)); 
			t[i].setName("Thread" + (i+1));
		}
		
		for(int i=0; i<numThread; i++) t[i].start();
		
		for(int i=0; i<numThread; i++) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<numThread; i++) {
			System.out.println(t[i].getName()+ " : ");
			System.out.println("Sum = " + t[i].sum);
			System.out.printf("Mean = %.2f\n" ,t[i].Means);
			System.out.println("---------------");
		}
		
		double totalSum = 0;double n= 0.0;
		for (int i=0; i<numThread; i++)
			totalSum += t[i].getMeanscore();
		n = totalSum/(float)numThread;
		System.out.println("Main Thread : ");
		System.out.printf("Overall Mean = %.2f\n " ,n );
	}
	
	/*** Do not modify this method ***/
	private static void init(int[] score) {
		int i=0;
		for(i=0; i<100000; i++) 		score[i] = (i%2)==0?5:8;
		for(i=100000; i<200000; i++)	score[i] = (i%2)==0?4:7;
		for(i=200000; i<300000; i++)	score[i] = (i%2)==0?8:9;
	}
	
	
}

/*
Thread1:
Sum = 650000
Mean = 6.50
---------------
Thread2:
Sum = 550000
Mean = 5.50
---------------
Thread3:
Sum = 850000
Mean = 8.50
---------------
Main Thread:  (mean1+mean2+mean3)/3.0;
Overall Mean = 6.83
*/