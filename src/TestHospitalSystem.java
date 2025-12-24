public class TestHospitalSystem {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();

        system.addPatient(new Patient(101, "Elif", 5, 28));
        system.addPatient(new Patient(245, "Mert", 2, 34));
        system.addPatient(new Patient(389, "Zeynep", 8, 19));
        system.addPatient(new Patient(412, "Arda", 1, 45));
        system.addPatient(new Patient(567, "Selin", 4, 62));
        system.addPatient(new Patient(634, "Can", 9, 7));
        system.addPatient(new Patient(721, "Merve", 3, 51));
        system.addPatient(new Patient(890, "Emir", 7, 22));
        system.addPatient(new Patient(955, "Kerem", 6, 38));
        system.addPatient(new Patient(123, "Aslı", 10, 80));    // Added 10 patients to the system.


        system.addTreatmentRequest(new TreatmentRequest(142, true));    // Deleted 1st
        system.addTreatmentRequest(new TreatmentRequest(316, false));   // Deleted 4th
        system.addTreatmentRequest(new TreatmentRequest(475, false));
        system.addTreatmentRequest(new TreatmentRequest(927, true));    // Deleted 2nd
        system.addTreatmentRequest(new TreatmentRequest(608, false));
        system.addTreatmentRequest(new TreatmentRequest(841, false));
        system.addTreatmentRequest(new TreatmentRequest(583, true));    // Deleted 3rd
        system.addTreatmentRequest(new TreatmentRequest(259, false));   // Added 5 normal and 3 priority treatment requests.


        system.addDischargeRecord(654);
        system.addDischargeRecord(543); // Added 2 discharge records.


        system.processTreatmentRequest();
        system.processTreatmentRequest();
        system.processTreatmentRequest();
        system.processTreatmentRequest();   // Process 4 treatment requests (priority first).


        system.printCurrentSystemState();   // Printed the final system state.

    }
}
