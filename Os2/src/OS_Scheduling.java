import java.util.Scanner;
public class OS_Scheduling {
	public static void main(String[] args) {
        try {
    	    
	    System.out.print("Enter the number of processes (at least 5): ");
	    Scanner in = new Scanner(System.in);
	    int numProcesses=0;
	while (true) { 
		  int num = in.nextInt();
		  if (num >= 5) {numProcesses=num;break;}
		  System.out.println("Please Enter Number of processes must greater than or equal to 5.");
		  System.out.print("Enter the number of processes : ");
		  }

        int processid[] = new int[numProcesses];//process Name
        int Servicet[] = new int[numProcesses];//Process Service Time
        int Arrivalt[] = new int[numProcesses];//Process Arrival Time
        int finish[] = new int[numProcesses];//for SPN if process finish

        for(int i = 0; i < numProcesses; i++) {
            System.out.println("Enter process " + (i+1) + " arrival time: ");
            Arrivalt[i] = in.nextInt();
            System.out.println("Enter process " + (i+1) + " service time: ");
            Servicet[i] = in.nextInt();
            processid[i] = i+1;
            finish[i] = 0;
        }
        in.close();
        int temp;//Temporary Storage
        for (int i = 0; i < numProcesses; i++) {//Sort by process
            for (int j = i+1; j < numProcesses; j++) {
                if(Arrivalt[i] > Arrivalt[j]) {
                    temp = Arrivalt[i];
                    Arrivalt[i] = Arrivalt[j];
                    Arrivalt[j] = temp;
                    temp = processid[i];
                    processid[i] = processid[j];
                    processid[j] = temp;
                    temp = Servicet[i];
                    Servicet[i] = Servicet[j];
                    Servicet[j] = temp;
                }
            }
        }
        fcfsScheduling(numProcesses,processid,Servicet,Arrivalt);//call fcfsScheduling
        spnScheduling(numProcesses,processid,Servicet,Arrivalt,finish);//call spnScheduling
	
	}
	catch (Exception  e) {
		System.err.println("ERROR: System.in.read\n" + e.getMessage());}
	}
	
	public static void fcfsScheduling(int Processes,int processid[],int Servicet[],int Arrivalt[]) {
        System.out.println("\n=================================================================================");
        System.out.println("\t\t\t\tFCFS Scheduling:");
        System.out.println("=================================================================================");

        float avgwaitingtt=0, avgTurnarounda=0;
        int completet[] = new int[Processes];//complete Time
        int Turnaroundt[] = new int[Processes];//turnaroundTime
        int waitingt[] = new int[Processes];//waitingTime

        completet[0] = Servicet[0] + Arrivalt[0];//set complete time for process id[0]
        for(int i = 1; i < Processes; i++) {//set complete time for process id[i]
        	completet[i] = completet[i - 1] + Servicet[i];
        }
        for(int i = 0; i < Processes; i++) {//set Turnaround Time and Waiting Time for process id[i]
        	Turnaroundt[i] = completet[i] - Arrivalt[i];
        	waitingt[i] = Turnaroundt[i] - Servicet[i];
        }
        System.out.println("\nProcess  Arrival time   Service time    complete Time    Turnaround Time   waiting Time");
        for(int i = 0; i < Processes; i++) {//Calculate Average Turnaround Time and Average Waiting Time
        	System.out.println("   "+processid[i]+"\t\t" + Arrivalt[i] + "\t\t" + Servicet[i]+ "\t\t" + completet[i]+ "\t\t" + Turnaroundt[i]+ "\t\t" + waitingt[i]);
        	avgwaitingtt+= waitingt[i];
        	avgTurnarounda+= Turnaroundt[i];
        }
        System.out.println ("\nAverage Turnaround Time is "+ (float)(avgTurnarounda/Processes));
        System.out.println ("Average Waiting Time is "+ (float)(avgwaitingtt/Processes));
        System.out.print ("Order of completed Processes is ");
        for(int i = 0; i < Processes; i++) {
        	System.out.print("Process" + processid[i] +" ");
    		}
    	}

	public static void spnScheduling(int Processes,int processid[],int Servicet[],int Arrivalt[],int f[]) {	
        System.out.println("\n=================================================================================");
		System.out.println("\t\t\t\tSPN Scheduling:");
        System.out.println("=================================================================================");
		int sti=0, tot=0;
        float avgwaitingt=0, avgTurnarounda=0;
		int completet[] = new int[Processes];//complete Time
	    int Turnaroundt[] = new int[Processes];//turnaround Time
	    int waitingt[] = new int[Processes];//waiting Time
		while(true){
            int c=Processes, min = 999999999;
            if (tot == Processes)//end for while loop if allProcess has done
                break;
            for (int i=0; i<Processes; i++){//set min Process to running
                if ((Arrivalt[i] <= sti) && (f[i] == 0) && (Servicet[i]<min)){
                    min=Servicet[i];
                    c=i;
                }
            }
            if (c==Processes)//last process to running
                sti++;
            else{
            	completet[c]=sti+Servicet[c];
                sti+=Servicet[c];
                Turnaroundt[c]=completet[c]-Arrivalt[c];//set Turnaround Time  
                waitingt[c]=Turnaroundt[c]-Servicet[c];{//set Waiting Time  
                f[c]=1;//set Process is finish
                processid[tot] = c + 1;//Change Name of Process to finish
                tot++;//Process Done
            }
        }
         }
        System.out.println("\nProcess  Arrival time   Service time    complete Time   Turnaround Time   waiting Time");
        for(int i=0;i<Processes;i++)//Calculate Average Turnaround Time and Average Waiting Time
        {
            System.out.println("   "+processid[i]+"\t\t"+Arrivalt[i]+"\t\t"+Servicet[i]+"\t\t"+completet[i]+"\t\t"+Turnaroundt[i]+"\t\t"+waitingt[i]);
            avgwaitingt+= waitingt[i];
            avgTurnarounda+= Turnaroundt[i];
        }
        System.out.println ("\nAverage Turnaround Time is "+ (float)(avgTurnarounda/Processes));
        System.out.println ("Average Waiting Time is "+ (float)(avgwaitingt/Processes));
        System.out.print ("Order of completed Processes is ");
        for(int i=0;i<Processes;i++)
        {
        	System.out.print("Process" + processid[i] +" ");
        }	
	}
	
}
