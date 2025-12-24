public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId) { // Constructor
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "patientId: " + patientId + ", dischargeTime: " + String.format("%tT", dischargeTime);
    }
}
