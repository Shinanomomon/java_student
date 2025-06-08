import java.util.*;
import java.io.*;

public class Scheduler extends Process{
    public Scheduler(char id, int serviceTime, int arrivalTime) {
		super(id, serviceTime, arrivalTime);		
	}

	public static void main(String[] args) {
		/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes (at least 5): ");
        int numProcesses = scanner.nextInt();

        List<Process> processes = new ArrayList<>();
        for (int i = 0; i < numProcesses; i++) {
        	System.out.print("Enter arrival time for process " + (i + 1) + ": ");
            int arrivalTime = scanner.nextInt();
            System.out.print("Enter service time for process " + (i + 1) + ": ");
            int serviceTime = scanner.nextInt();
            processes.add(new Process(i + 1, serviceTime, arrivalTime));
        }

        System.out.print("Enter quantum time for Round Robin: ");
        int quantumTime = scanner.nextInt();
        scanner.close();
		*/
		/////////////////////////////
		List<Process> processes = new ArrayList<>();
		processes.add(new Process('A', 3, 0));
		processes.add(new Process('B', 6, 2));
		processes.add(new Process('C', 4, 4));
		processes.add(new Process('D', 5, 6));
		processes.add(new Process('E', 2, 8));
		int quantumTime = 1;
		////////////////////////
        System.out.println("=================================================================================");
        for (Process process : processes) {
            System.out.println("Arrival time for process "+process.id+" : "+process.arrivalTime+"  ==> Service time : "+process.serviceTime );
        }
        System.out.printf("Quantum time for Round Robin: %d",quantumTime);
        System.out.println("\n=================================================================================");
        
        // Sort the processes by arrival time
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        // FCFS Scheduling
        fcfsScheduling(new ArrayList<>(processes));

        // Round Robin Scheduling
        roundRobinScheduling(new ArrayList<>(processes), quantumTime);

        // SPN Scheduling
        spnScheduling(new ArrayList<>(processes));

        // Calculate and display average turnaround and waiting times
        //displayAverageTimes(new ArrayList<>(processes));
    }

    public static void fcfsScheduling(List<Process> processes) {
        System.out.println("\nFCFS Scheduling:");
        int currentTime = 0;
        for (Process process : processes) {
            process.turnaroundTime = currentTime + process.serviceTime - process.arrivalTime;
            process.waitingTime = process.turnaroundTime - process.serviceTime;
            currentTime += process.serviceTime;
            System.out.println("Process " + process.id + " - Turnaround Time: " + process.turnaroundTime + " Waiting Time: " + process.waitingTime);
        }
        displayAverageTimes(new ArrayList<>(processes));
    }

    public static void roundRobinScheduling(List<Process> processes, int quantumTime) {
    	System.out.println("\nRound Robin Scheduling:");
        int currentTime = 0;
        Queue<Process> queue = new LinkedList<>(processes);
        while (!queue.isEmpty()) {
            Process process = queue.poll();
            int remainingTime = process.serviceTime;
            if (remainingTime <= quantumTime) {
                currentTime += remainingTime;
                process.turnaroundTime = currentTime - process.arrivalTime;
                process.waitingTime = process.turnaroundTime - process.serviceTime;
                System.out.println("Process " + process.id + " - Turnaround Time: " + process.turnaroundTime + " Waiting Time: " + process.waitingTime);
            } else {
                currentTime += quantumTime;
                remainingTime -= quantumTime;
                process.serviceTime = remainingTime;
                queue.add(process);
            }
        }       
        displayAverageTimes(new ArrayList<>(processes));
    }

    public static void spnScheduling(List<Process> processes) {
    	System.out.println("\nSPN Scheduling:");
        int currentTime = 0;
        while (!processes.isEmpty()) {
            Process shortestProcess = null;
            for (Process process : processes) {
                if (process.arrivalTime <= currentTime && (shortestProcess == null || process.serviceTime < shortestProcess.serviceTime)) {
                    shortestProcess = process;
                }
            }
            if (shortestProcess == null) {
                currentTime++;
            } else {
                currentTime += shortestProcess.serviceTime;
                shortestProcess.turnaroundTime = currentTime - shortestProcess.arrivalTime;
                shortestProcess.waitingTime = shortestProcess.turnaroundTime - shortestProcess.serviceTime;
                processes.remove(shortestProcess);
                System.out.println("Process " + shortestProcess.id + " - Turnaround Time: " + shortestProcess.turnaroundTime + " Waiting Time: " + shortestProcess.waitingTime);
            }
        }

    }

    public static void displayAverageTimes(List<Process> processes) {
        int totalTurnaroundTime = 0;
        int totalWaitingTime = 0;
        for (Process process : processes) {
            totalTurnaroundTime += process.turnaroundTime;
            totalWaitingTime += process.waitingTime;
        }
        double averageTurnaroundTime = (double) totalTurnaroundTime / processes.size();
        double averageWaitingTime = (double) totalWaitingTime / processes.size();
        System.out.println("\nAverage Turnaround Time: " + averageTurnaroundTime);
        System.out.println("Average Waiting Time: " + averageWaitingTime);
    }
}
