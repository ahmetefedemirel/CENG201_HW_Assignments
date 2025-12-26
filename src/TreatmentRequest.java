public class TreatmentRequest {
    int patientId;
    long arrivalTime; // Creating the next pointer for queue
    boolean priority;   // Adding a priority boolean

    public TreatmentRequest(int patientId) {    // Constructor
        this.patientId = patientId;
        arrivalTime = System.currentTimeMillis();
    }

    public TreatmentRequest(int patientId, boolean priority){   // 2nd constructor for TASK-4
        this.patientId = patientId;
        this.priority = priority;
        arrivalTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {  // toString method.
        return
                "patientId: " + patientId + ", arrivalTime: " + String.format("%tT", arrivalTime);
    }
}
