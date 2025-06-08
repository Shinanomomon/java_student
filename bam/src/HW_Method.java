/*
 name : Khachaporn Lunthaiyo
 ID : 6502041620018
 Sect : CED 1 DERA
*/
import java.util.Scanner;
public class HW_Method {
		public static String shirtSize(int chest) { 
			String Size;
			System.out.println("Your Chest is " + chest + " .");
			if(chest>=44){Size = "EXtra Large (XL)";}
			else if(chest>=42){Size = "Large (L)";}
		 	else if(chest>=40){Size = "Medium (M)";}
			else if(chest>=0){Size = "Small (S)";}
			else {Size= "No Size";}
			return Size ;
		}
		public static int Factorial(int num) {
		    System.out.println("==========================");
		    System.out.println("       CED Factory        ");
		    System.out.println("==========================");
		    System.out.println("Quantity produced: "+num);
		    System.out.println("--------------------------\n");
		    return num;
		}
		
		public static void ShowData(int Nfac,String size) {
		    System.out.println("===================================");
			System.out.println("- Your size is : "+size);
			System.out.println("- Number of shrit you want: "+Nfac);
		    System.out.println("===================================\n");
		}
		
		public static void main(String[] args) {
			String size; int Nfac;int chest;
		    System.out.print("Enter your Chest: ");
		    Scanner SH = new Scanner(System.in);
		    chest = SH.nextInt(); 
		    System.out.print("How mach do you want: ");
		    Scanner FA = new Scanner(System.in);
		    Nfac = FA.nextInt();
			SH.close();
		    FA.close();
			
			size = shirtSize(chest); 
			Nfac = Factorial(Nfac);
			ShowData(Nfac,size);
			}
}
