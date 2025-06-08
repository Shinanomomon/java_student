import java.util.Arrays;

public class MainSum {

	public static void main(String[] args) {
		int[] score = { 8, 7, 5, 7, 6, 9, 10, 8, 7, 4, 6, 9, 5, 6, 4, 8, 9, 9, 6, 7, 8, 4, 9};
		/*
		int[] s1 = Arrays.copyOfRange(score, 0, 10);
		int[] s2 = Arrays.copyOfRange(score, 10, 20);
		int[] s3 = Arrays.copyOfRange(score, 20, 30);
		*/
		int numThread = 6;
		ThreadSum[] t = new ThreadSum[numThread];
		
		int start=0, end=0;
		for(int i=0; i<numThread; i++) {
			start = i*score.length/numThread;
			end = start+score.length/numThread;
			t[i] =new ThreadSum(Arrays.copyOfRange(score, start, end)); 
			t[i].setName("Sum" + i);
		}
		for(int i=0; i<numThread; i++) t[i].start();
		for(int i=0; i<numThread; i++) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int totalSum = 0;
		for (int i=0; i<numThread; i++)
			totalSum += t[i].getSum();
		
		System.out.printf("Total some = %d\n " , totalSum );
			/*
		ThreadSum t1, t2, t3;
		t1 = new ThreadSum(s1); t1.setName("Sum1");
		t2 = new ThreadSum(s2); t2.setName("Sum2");
		t3 = new ThreadSum(s3); t3.setName("Sum3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join(); t2.join(); t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int totalSum = t1.getSum() + t2.getSum() + t3.getSum();
		
		System.out.println("Total some = " + totalSum );
		*/
				
		

	}

}
