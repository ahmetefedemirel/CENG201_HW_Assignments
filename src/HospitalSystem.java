import java.util.HashMap;

public class HospitalSystem {
    public PatientList patientList;
    public TreatmentQueue treatmentQueue;
    public DischargeStack dischargeStack;
    public HashMap<Integer, Patient> hashMap;
    public int[] BubbleSortArray;

    public HospitalSystem(){    // Creating our PatientList, TreatmentQueue, DischargeStack.
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue(true);
        dischargeStack = new DischargeStack();
        hashMap = new HashMap<>();
    }

    public void addPatient(Patient patient, boolean priority){     // Adding patient to patientList.
        patientList.addPatient(patient);
        hashMap.put(patient.id, patient);
    }

    public void addTreatmentRequest(TreatmentRequest request){    // Adding patient to treatmentQueue.
        treatmentQueue.enqueueByPriority(request);
    }

    public void admitPatient(Patient patient, boolean priority){
        addPatient(patient, priority);
        TreatmentRequest treatmentRequest = new TreatmentRequest(patient.id, priority);
        addTreatmentRequest(treatmentRequest);
    }

    public void addDischargeRecord(int patientId){     // Adding discharge record to discharge stack.
        DischargeRecord dischargeRecord = new DischargeRecord(patientId);
        dischargeStack.push(dischargeRecord);
        hashMap.remove(patientId);
        patientList.removePatient(patientId);
    }

    public void processTreatmentRequest() {;
        TreatmentRequest treatmentRequest = treatmentQueue.dequeuePriority();
        addDischargeRecord(treatmentRequest.patientId);

    }


    public void printCurrentSystemState(){  // Printing current system state.
        if(patientList.getHead() == null || treatmentQueue.getHead() == null){
            System.out.println("There is no patient yet.");
        }
        System.out.println("Patient List: ");   // Patient list heading
        System.out.println("----------------");
        patientList.printList();    // Printing the list.

        System.out.println("Patient Queue: ");  // Patient queue heading
        System.out.println("----------------");
        treatmentQueue.printQueueByPriority();    //Printing the queue

        if(dischargeStack != null){
            System.out.println("Discharge Stack: ");    // Discharge Stack heading
            System.out.println("----------------");
            dischargeStack.printStack();    // Printing the stack.
        }
    }



    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.admitPatient(new Patient(543, "Ahmet", 6, 76), false);
        system.admitPatient(new Patient(412, "Ali", 5, 34), false);
        system.admitPatient(new Patient(425, "Mehmet", 8, 64), true);
        system.admitPatient(new Patient(987, "Murat", 9, 65), false);
        system.admitPatient(new Patient(654, "Kemal", 1, 32), true);

        //system.printCurrentSystemState();   // Printing the initial system state.

        system.processTreatmentRequest();   // Process 1 time.
        system.processTreatmentRequest();   //Process 1 time.


        system.printCurrentSystemState();   // Printing the final system state.




    }
}
