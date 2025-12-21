public class TreatmentRequest {
    int patientId;
    long arrivalTime; // Creating the next pointer for queue

    public TreatmentRequest(int patientId) {    // Constructor
        this.patientId = patientId;
        arrivalTime = System.currentTimeMillis();
    }

}
