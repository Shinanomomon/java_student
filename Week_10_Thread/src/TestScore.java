/*
 * Name : Panus Chanthawibool
 * ID   : 6502041620085
 */
public class TestScore {

	public static void main(String[] args) {
		
		int[] A = {};
		int[] B = {};
		
		Score CED,TCT,TCTT;
		A = new Score(A); TCT.setName("TCTRA");
		B = new Score(B); TCTT.setName("TCTTA");
		
		CED.start(); TCT.start(); TCTT.start();
		
		try {
			CED.join(); TCT.join(); TCTT.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
        double totasec = CED.getSum() + TCT.getSum() + TCTT.getSum();
        double avg = totasec/(CEDRA.length+TCTRA.length+TCTTA.length); 
        System.out.println("\n===============================");
		System.out.printf("Total of 3 Sect is : %.2f",totasec);
		System.out.printf("\nTotal of Length is : " + (CEDRA.length+TCTRA.length+TCTTA.length));
		System.out.printf("\nAverage of 3 Sect is : %.2f",avg);
		System.out.println("\n===============================");
		// Create 3 Thread to calculate the average score for each section separately.
		// After that, compute the overall average score here in main().

	}

}
