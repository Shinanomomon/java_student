import java.util.Scanner;

public class SPN {

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
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];
        int[] finishTime = new int[n];
        boolean[] completed = new boolean[n];

        System.out.println("Enter arrival time and Service time process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + " -----Arrival Time-----:-----Service Time-----:");
            arrivalTime[i] = scanner.nextInt();
            serviceTime[i] = scanner.nextInt();
            P[i] = i + 1;
        }
        

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrivalTime[i] > arrivalTime[j]) {
                 
                    int temp = arrivalTime[i];
                    arrivalTime[i] = arrivalTime[j];
                    arrivalTime[j] = temp;

               
                    temp = P[i];
                    P[i] = P[j];
                    P[j] = temp;

                
                    temp = serviceTime[i];
                    serviceTime[i] = serviceTime[j];
                    serviceTime[j] = temp;
                }
            }
        }

        scanner.close();

        int currentTime = 0;
        int completedProcesses = 0;

        while (completedProcesses < n) {
            int shortestProcess = -1;
            int shortestTime = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (!completed[i] && arrivalTime[i] <= currentTime && serviceTime[i] < shortestTime) {
                    shortestTime = serviceTime[i];
                    shortestProcess = i;
                }
            }

            if (shortestProcess == -1) {
                
                currentTime++;
            } else {
             
                waitingTime[shortestProcess] = currentTime - arrivalTime[shortestProcess];
                finishTime[shortestProcess] = currentTime + serviceTime[shortestProcess];
                currentTime += serviceTime[shortestProcess];
                turnaroundTime[shortestProcess] = waitingTime[shortestProcess] + serviceTime[shortestProcess];
                completed[shortestProcess] = true;
                completedProcesses++;
            }
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
