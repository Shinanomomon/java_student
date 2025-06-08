
class Process {
    char id;
    int serviceTime;
    int arrivalTime;
    int turnaroundTime;
    int waitingTime;


    public Process(char id, int serviceTime, int arrivalTime) {
        this.id = id;
        this.serviceTime = serviceTime;
        this.arrivalTime = arrivalTime;
        this.turnaroundTime = 0;
        this.waitingTime = 0;

    }
}

