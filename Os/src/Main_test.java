
import java.util.*;
public class Main_test  {
	public static void main(String[] args) {
		int num = 0 ; int nq = 0; int q =0; int mq =0;
	try {
	    
	    System.out.print("Enter the number of processes (at least 5): ");
	    Scanner SC0 = new Scanner(System.in);
    
	while (true) { 
		  num = SC0.nextInt();
		  if (num >= 5) break;
		  System.out.println("Please Enter Number of processes must greater than or equal to 5.");
		  System.out.print("Enter the number of processes : ");
		  }
  	
	int [] arrival_time = new int[num];
    int [] service_time = new int[num];

  	Scanner SC1 = null; Scanner SC2 = null;
  	
  	for (int i = 0; i < num; i++) {
  		System.out.printf("Enter Arrival Time for Process %d: ", i + 1);
  		SC1 = new Scanner(System.in);
  		arrival_time[i]= SC1.nextInt();
  		System.out.printf("Enter Service Time for Process %d: ", i + 1);
  		SC2 = new Scanner(System.in);
  		service_time[i]= SC2.nextInt();
    }

  	 for(int i=0; i<arrival_time.length; i++) {
  		  q = service_time[i];
  		  if(q>mq) {mq=q;}
  		  } 
   	System.out.println("=======================================================");
  	System.out.println("Most of Service Time is : " + mq);
  	System.out.println("=======================================================");
  	
  	System.out.print("Enter the number of Quantum Time: ");
    Scanner SC3 = new Scanner(System.in);
while (true) { 
	  nq = SC3.nextInt();
	  if (nq <= mq) break;
	  System.out.printf("Please Enter Number of Quantum Time must less than Service Time (%d)/n",mq);
	  System.out.print("Enter the number of Quantum Time : ");
	  }

  	SC0.close(); SC1.close(); SC2.close(); SC3.close();
  	
  	FCFS F = new FCFS("First-Come-First-Served (FCFS)");
  	Round_Robin R = new Round_Robin();
  	SPN S = new SPN("Shortest Porcess Next (SPN)");
  	
  	
  
    int[] processes = {1, 2, 3, 4};
    int[] burstTime = {10, 5, 8, 12};
    int quantum = 2;
    R.roundRobin(processes, burstTime, quantum);
    
  	
  	
   	System.out.println("=======================================================");
	for(int i=0; i<num; i++) {	System.out.printf("Arrival Time for Process %d: "+arrival_time[i] + " Service Time : "+service_time[i]+"\n", i + 1);}
	
   	System.out.println("=======================================================");
   	System.out.println("Number of Process is : " + num);
  	//System.out.println("Array of Service Time size is : " + service_time.length);
  	System.out.println("Most of Service Time is : " + mq);
  	System.out.println("=======================================================");
	}
	catch (Exception  e) {
		System.err.println("ERROR: System.in.read\n" + e.getMessage());
	}
}
}
  	
	


