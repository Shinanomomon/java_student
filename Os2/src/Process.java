class Process {
    int id;
    int serviceTime;
    int arrivalTime;
    int remainingTime;

    public Process(int id, int serviceTime, int arrivalTime) {
        this.id = id;
        this.serviceTime = serviceTime;
        this.arrivalTime = arrivalTime;
        this.remainingTime = serviceTime;
    }
}