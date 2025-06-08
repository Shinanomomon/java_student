import java.util.LinkedList;
import java.util.Queue;



public class RoundRobin {
    public static void main(int ser[],int arr[],int q) {
        int[] serviceTimes = {3, 6, 4, 5, 2};
        int[] arrivalTimes = {0, 2, 4, 6, 8};
        int quantumTime = 1;

        int n = serviceTimes.length;
        Queue<Process> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Process(i + 1, serviceTimes[i], arrivalTimes[i]));
        }

        int currentTime = 0;
        int[] turnaroundTimes = new int[n];
        int[] waitingTimes = new int[n];

        while (!queue.isEmpty()) {
            Process currentProcess = queue.poll();
            int executionTime = Math.min(quantumTime, currentProcess.remainingTime);
            currentTime += executionTime;
            currentProcess.remainingTime -= executionTime;

            if (currentProcess.remainingTime > 0) {
                queue.add(currentProcess);
            } else {
                turnaroundTimes[currentProcess.id - 1] = currentTime - currentProcess.arrivalTime;
                waitingTimes[currentProcess.id - 1] = turnaroundTimes[currentProcess.id - 1] - currentProcess.serviceTime;
            }
        }

        int totalTurnaroundTime = 0;
        int totalWaitingTime = 0;

        System.out.println("Process\tTurnaround Time/t\tWaiting Time");
        for (int i = 0; i < n; i++) {
            System.out.println("  P" + (i + 1) + "\t\t" + turnaroundTimes[i] + "\t\t\t" + waitingTimes[i]);
            totalTurnaroundTime += turnaroundTimes[i];
            totalWaitingTime += waitingTimes[i];
        }

        double averageTurnaroundTime = (double) totalTurnaroundTime / n;
        double averageWaitingTime = (double) totalWaitingTime / n;

        System.out.println("\nAverage Turnaround Time: " + averageTurnaroundTime);
        System.out.println("Average Waiting Time: " + averageWaitingTime);
    }
}
