public class HospitalSystem {
    public PatientList patientList;
    public TreatmentQueue treatmentQueue;
    public DischargeStack dischargeStack;

    public HospitalSystem(){    // Creating our PatientList, TreatmentQueue, DischargeStack.
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
    }

    public void addPatient(Patient patient){     // Adding patient to patientList.
        patientList.addPatient(patient);
    }

    public void addTreatmentRequest(Patient p){    // Adding patient to treatmentQueue.
        treatmentQueue.enqueue(p);
    }

    public void admitPatient(Patient patient){
        addPatient(patient);
        addTreatmentRequest(patient);
    }

    public void addDischargeRecord(int patientId){     // Adding discharge record to discharge stack.
        Patient p = patientList.findPatient(patientId);
        dischargeStack.push(p);
    }

    public void processTreatmentRequest() {
        Patient treatedPatient = treatmentQueue.dequeue();

        if (treatedPatient == null) {
            System.out.println("Treatment queue is empty");
            return;
        }

        dischargeStack.push(treatedPatient);
        patientList.removePatient(treatedPatient.id);
    }


    public void printCurrentSystemState(){  // Printing current system state.
        if(patientList.head == null || treatmentQueue.head == null){
            System.out.println("There is no patient yet.");
        }
        System.out.println("Patient List: ");   // Patient list heading
        System.out.println("----------------");
        patientList.printList();    // Printing the list.

        System.out.println("Patient Queue: ");  // Patient queue heading
        System.out.println("----------------");
        treatmentQueue.printQueue();    //Printing the queue

        if(dischargeStack != null){
            System.out.println("Discharge Stack: ");    // Discharge Stack heading
            System.out.println("----------------");
            dischargeStack.printStack();    // Printing the stack.
        }
    }

    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.admitPatient(new Patient(123, "Ahmet", 4, 21));
        system.admitPatient(new Patient(412, "Ali", 5, 34));
        system.admitPatient(new Patient(425, "Mehmet", 8, 64));
        system.admitPatient(new Patient(987, "Murat", 9, 65));
        system.admitPatient(new Patient(654, "Kemal", 1, 32));

        system.printCurrentSystemState();   // Printing the initial system state.

        system.processTreatmentRequest();   // Process 1 time.
        system.processTreatmentRequest();   //Process 1 time.


        system.printCurrentSystemState();   // Printing the final system state.




    }
}
