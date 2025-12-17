public class TreatmentRequest {
    int patientId;
    String name;
    long arrivalTime;
    TreatmentRequest next;  // Creating the next pointer for queue

    public TreatmentRequest(int patientId) {    // Constructor
        this.patientId = patientId;
        arrivalTime = System.currentTimeMillis();
        this.next = null;
    }

}
