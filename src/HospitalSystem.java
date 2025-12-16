public class HospitalSystem {
    public PatientList patientList;
    public TreatmentQueue treatmentQueue;
    public DischargeStack dischargeStack;

    public HospitalSystem(){    // Creating our PatientList, TreatmentQueue, DischargeStack.
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
    }

    public void addPatient(int id, String name , int severity, int age){     // Adding patient to patientList.
        patientList.addPatient(id, name, severity, age);
    }

    public void addTreatmentRequest(int id){    // Adding patient to treatmentQueue.
        treatmentQueue.enqueue(id);
    }

    public void admitPatient(int id, String name, int severity, int age){
        addPatient(id, name, severity, age);
        addTreatmentRequest(id);
    }

    public void addDischargeRecord(int id){     // Adding discharge record to discharge stack.
        dischargeStack.push(id);                // When the patient discharges.
    }

    public void processTreatmentRequest() {
        addDischargeRecord(treatmentQueue.head.patientId); // Adding the patient to dischargeStack by addDischargeRecord method.
        treatmentQueue.dequeue();   // Removing the patient from treatmentQueue (from beginning of the queue FIFO)
    }


    public void printCurrentSystemState(){
        if(patientList.head == null || treatmentQueue.head == null){
            System.out.println("There is no patient yet.");
        }
        System.out.println("Patient List: ");
        System.out.println("----------------");
        patientList.printList();

        System.out.println("Patient Queue: ");
        System.out.println("----------------");
        treatmentQueue.printQueue();

        if(dischargeStack != null){
            System.out.println("Discharge Stack: ");
            System.out.println("----------------");
            dischargeStack.printStack();
        }
    }

    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.admitPatient(123, "Ahmet", 4, 21);
        system.admitPatient(412, "Ali", 5, 34);
        system.admitPatient(425, "Mehmet", 8, 64);
        system.admitPatient(987, "Murat", 9, 65);
        system.admitPatient(654, "Kemal", 1, 32);

        system.processTreatmentRequest();
        system.processTreatmentRequest();


        system.printCurrentSystemState();
    }
}
