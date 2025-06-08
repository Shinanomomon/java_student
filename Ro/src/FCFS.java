import java.util.Scanner;

public class FCFS{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes (maximum 5): ");
        int n = scanner.nextInt();
        	
        if (n < 5) {
            System.out.println("Invalid number of processes. Please enter a value between 1 and 5.");
            scanner.close();
            return;
        }
        
        int[] P = new int[n];
        int[] arrivalTime = new int[n];
        int[] serviceTime = new int[n];
        int[] finishTime = new int[n];
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];

        System.out.println("Enter arrival time and Service time process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + " -----Arrival Time-----:-----Service Time-----:");
            arrivalTime[i] = scanner.nextInt();
            serviceTime[i] = scanner.nextInt();
            P[i] = i+1;
        }
       
        scanner.close();

        finishTime[0] = arrivalTime[0] + serviceTime[0];

        for (int i = 1; i < n; i++) {
            if (arrivalTime[i] > finishTime[i - 1]) {
                finishTime[i] = arrivalTime[i] + serviceTime[i];
            } else {
                finishTime[i] = finishTime[i - 1] + serviceTime[i];
            }
        }

        waitingTime[0] = 0;

        for (int i = 1; i < n; i++) {
            waitingTime[i] = finishTime[i - 1] - arrivalTime[i];
        }

        for (int i = 0; i < n; i++) {
            turnaroundTime[i] = waitingTime[i] + serviceTime[i];
        }

        double averageWaitingTime = 0;
        double averageTurnaroundTime = 0;

        for (int i = 0; i < n; i++) {
            averageWaitingTime += waitingTime[i];
            averageTurnaroundTime += turnaroundTime[i];
        }

        averageWaitingTime /= n;
        averageTurnaroundTime /= n;

        System.out.println("\nProcess Time\tArrival Time\tService Time\tFinish Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println("Process " + P[i] + "\t\t" + arrivalTime[i] + "\t\t" + serviceTime[i] + "\t\t" + finishTime[i] + "\t\t" + waitingTime[i] + "\t\t" + turnaroundTime[i]);
        }
        
        System.out.println("Gantt Chart: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + P[i] + " ");
        }
        
        System.out.println("\nAverage Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
        System.out.println("Bravo !");
    }
}