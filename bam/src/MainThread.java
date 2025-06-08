import java.util.Arrays;

/* Soradech Krootjohn
 * TCT-RA
 */
public class MainThread {
	public static void main(String[] args) {
		int[] score = new int[300000];
		init(score);

		ThreadCalculator[] th = new ThreadCalculator[3];
		
		for(int numc=0; numc<3; numc++) {
			int start=0, end=99999;
			start = start+(numc*100000);
			end = end+(numc*100000);
			th[numc] = new ThreadCalculator(Arrays.copyOfRange(score, start, end)); 
			th[numc].setName("Thread"+(numc+1));
		}
		
		for(int numc=0; numc<3; numc++) th[numc].start();
		
		for(int numc=0; numc<3; numc++) {
			try {
				th[numc].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int numc=0; numc<3; numc++) {
			System.out.println(th[numc].getName()+ " : ");
			System.out.println("Sum = " + th[numc].sum);
			System.out.printf("Mean = %.2f\n" ,th[numc].mean);
			System.out.println("---------------");
		}
		
		double totalSum = 0;double num= 0.0;
		for (int numc=0; numc<3; numc++)
			totalSum += th[numc].getMeanscore();
		num = (float)totalSum/3;
		System.out.println("Main Thread : ");
		System.out.printf("Overall Mean = %.2f\n " ,num );
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