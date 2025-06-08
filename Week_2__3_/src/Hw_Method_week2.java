import java.util.Scanner;

public class Hw_Method_week2 {

	public static void main(String[] args) {
	int m = 0;
    System.out.print("Enter number of multiplication_table: ");
    Scanner SC = new Scanner(System.in);
	
    	while (true) { 
    	  m = SC.nextInt();
		  if (m >= 2) break;
		  System.out.println("Please Enter number greater than or equal to 2.");
		  System.out.print("Enter number : ");}
	multiplication_table(m);
	
	int score ; char grade;
	System.out.print("Enter your grade: ");	
	score = SC.nextInt();
	SC.close();	
	grade = grade(score);
	System.out.println("You got " + grade + " .");	
		
	}
	public static void multiplication_table(int m) {
	    System.out.println("\nYou pick number "+m+".");	
		System.out.println("--------------------------");
		System.out.println("Count Unit : "+m);
			for (int sen = 1; sen < 13; sen=sen+1){
	    	System.out.println(m+" x "+sen+" = "+(m*sen));}
	    System.out.println("--------------------------\n");
	}
	
	public static char grade(int score) { 
		char grade;
		System.out.println("Your score is " + score + " .");
		while (true) { 
			if (score >= 80) {grade = 'A';
			break;}
			if (score >= 70) {grade = 'B';
			break;}
			if (score >= 60) { grade = 'C';
			break;}
			if (score >= 50) {grade = 'D';
			break;}
			if (score <50) {grade = 'F';
			break;}	
  		  }
		return grade ;
	}

}
