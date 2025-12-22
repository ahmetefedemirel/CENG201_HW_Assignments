public class TreatmentRequest {
    int patientId;
    long arrivalTime; // Creating the next pointer for queue
    boolean priority;   // Adding a priority boolean

    public TreatmentRequest(int patientId) {    // Constructor
        this.patientId = patientId;
        arrivalTime = System.currentTimeMillis();
    }

    public TreatmentRequest(int patientId, boolean priority){
        this.patientId = patientId;
        this.priority = priority;
        arrivalTime = System.currentTimeMillis();
    }

}
