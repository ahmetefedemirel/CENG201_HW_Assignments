import java.util.HashMap;
import java.util.ArrayList;

public class HospitalSystem{
    public PatientList patientList;
    public TreatmentQueue treatmentQueue;
    public DischargeStack dischargeStack;
    public HashMap<Integer, Patient> hashMap;

    public HospitalSystem(){    // Creating our PatientList, TreatmentQueue, DischargeStack.
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue(true);
        dischargeStack = new DischargeStack();
        hashMap = new HashMap<>();
    }

    public void addPatient(Patient patient){     // Adding patient to patientList.
        patientList.addPatient(patient);
        hashMap.put(patient.id, patient);
    }

    public void addTreatmentRequest(TreatmentRequest request){    // Adding patient to treatmentQueue.
        treatmentQueue.enqueueByPriority(request);
    }

    public void admitPatient(Patient patient, boolean priority){
        addPatient(patient);
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
        sortPatientsBySeverity();
    }

    public void sortPatientsBySeverity(){   // Sorting method by Bubble Sort manner.
        ArrayList<Patient> list = patientList.getAllPatientsAsList();   // Creating new ArrayList from getAllPatientAsList method.

        int n = list.size();    // Int n = list.size();
        for (int i = 0; i < n - 1; i++){    // Outer for loop
            for(int j = 0; j < n - i - 1; j++){ // Inner for loop (each step it compares with previous one)
                if(list.get(j).severity < list.get(j + 1).severity){    // Check the severities and the smaller one comes to front.
                    Patient temp = list.get(j); // Temp holds jth index of the list.
                    list.set(j, list.get(j + 1));   // Set method swaps index j with at the (j + 1)th element.
                    list.set(j + 1, temp);  // Shifting the temp.
                }
            }
        }
        System.out.println("\n--- The patients are sorted by severity levels.");    // Heading
        for(int i = 0; i < list.size(); i++){   // i is index of the list.
            Patient p = list.get(i);    // ith element of the list is Patient p
            System.out.println(i + 1 + ". " + p.name + " " + " Severity level: " + p.severity); // print the order.
        }
    }
}
