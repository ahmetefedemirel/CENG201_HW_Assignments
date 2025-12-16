public class DischargeRecord {
    int patientId;
    long dischargeTime;
    DischargeRecord next;   // Creating the next pointer.

    public DischargeRecord(int patientId) { // Constructor
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
        this.next = null;
    }
}
