import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		int x = 0;
		System.out.print("Please,Enter Number: ");
		
		// Get value from KBD
		Scanner SC = new Scanner(System.in);
		x = SC.nextInt();
		SC.close();//note ต้องปิดด้วย
		
		
		if(x<5)
			System.out.println("Please Enter number greater than 4");
			System.out.println("Bye Bye !!!!");
			System.exit(0);
		

		//***Iterations
		for(int i=0;i<x; i++) {
			//System.out.printf("%d: Hello CED!!!\n", i+1);
			System.out.println((i+1)+": Hello CED!!!");
		}
		
		
		//System.out.println("You enter: " + x); //string Concatenation
		
		/*if(x<50) {
			System.out.print("You FAIL.");
			System.out.println("Please try harder.");
			}
		else {
			  System.out.print("You PASS.");
			  System.out.print("Good Student!!!");
			}
		*\
		
		
	/*	 System.out.println("5 is greater than 6: "  +  (5>6)); 
	     System.out.println("6 is greater than or equal to 3: " + (6>=3)); 
	     System.out.println("8 is less than 10: " +  (8<10)); 
	*/	
		}

}
