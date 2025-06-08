import java.util.Scanner;
public class Multiplication_Table {

	public static void main(String[] args) {
		int num,sen ;

	    System.out.print("Enter number : ");
	    Scanner SC = new Scanner(System.in);
    
	    	while (true) { 
    		  num = SC.nextInt();
    		  if (num >= 2) break;
    		  System.out.println("Please Enter number greater than or equal to 2.");
    		  System.out.print("Enter number : ");}
	    	SC.close();
	    	
	    System.out.println("\nYou pick number "+num+".");	
		System.out.println("--------------------------");
		System.out.println("Count Unit : "+num);
			for ( sen = 1; sen < 13; sen=sen+1){
	    	System.out.println(num+" x "+sen+" = "+(num*sen));}
	    System.out.println("--------------------------\n");
	    System.out.println("Bye Bye !!!!");
	}

}
