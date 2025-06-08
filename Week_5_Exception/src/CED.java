import java.util.Scanner;

public class CED {
	public static void mian(String[] args) {
		int x;
		System.out.print("Enter number: ");
		
		Scanner sc = new Scanner(System.in);
		try{x = sc.nextInt();}
		catch(Exception imme) {
			System.out.print("Invalid number: x will be zero.");
			x=0;
		}
		sc.close();
		System.out.print("You enter: " + x );
		
		System.out.print("Enter number again: ");
			try{x
				= sc.nextInt();
					}
		catch(Exception ise) {
		System.out.print("Your scanner has been closeed.");
		x =0 ;
		}
		System.out.print("You enter: " + x );
		
		System.out.println("Bye Bye !!!!");
	}
}
