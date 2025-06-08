import java.util.Scanner;

public class TestMethod {

	public static void main(String[] args) {
/*4*/	
	//	System.out.println("Lucky Number is: " + myRandom2(5));
		int num = 0;
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter your random limit: ");
		num = SC.nextInt();
		
		int rnd = myRandom2(num);
		System.out.println("Lucky Number is " + rnd);
		SC.close();
		
/*3.	int rnd = myRandom();
		System.out.println("Lucky Number is " + rnd);
		
	// OR
		
		System.out.println("Lucky Number is " + myRandom());
	*/
	
/*2.	Scanner SC = new Scanner(System.in);
		
		String stdName;
		int stdAge;
		System.out.print("Enter your name: ");
		stdName = SC.next();
		System.out.print("Enter your age: ");
		stdAge = SC.nextInt();
		SC.close();
		
		printStdInfo("john", 19);
		printStdInfo(stdName, stdAge);
	*/	
		
/*1.	int choice = 0;
		Scanner SC = new Scanner(System.in);
		
		displayMenu();
		
		choice = SC.nextInt();
		System.out.println("You select:  "+choice);
	
		SC.close();
	*/
	}
	//4.Method with return with arg
	public static int myRandom2(int limit) {
		int rand = 0 ;
		rand = (int) Math.floor(Math.random()*limit) + 1;//1 - limit
		return rand;
	}
	
	//3.Method with return,no arg
	public static int myRandom() {
		int rand = 0 ;
	//  rand = (int) Math.ceil(Math.random()*10);//1-10//ceil=ปัดขึ้น
		rand = (int) Math.floor(Math.random()*10) + 1;//floor=ปัดลง
		return rand;
	}
	
	//2.Method with no return with arg
	private	static void printStdInfo(String name, int age) {
		System.out.println("================");
		System.out.println("Name: " + name);
		System.out.println(" Age: " + age);
		System.out.println("================");
}
	
	//1.Method with no return,no arg
	/*public*/ static void displayMenu() {
	/*public =สาธารณะ  ,private= ส่วนตัว  protected=การสืบทอด(เปิดกว้างแต่น้อยกว่าpublic)*/
		System.out.println("================");
		System.out.println(" 1. Add");
		System.out.println(" 2. Edit");
		System.out.println(" 3. Delete");
		System.out.println(" 4. Exit");
		System.out.println("================");
		System.out.print("Please select [1-4] : ");
	}
}
