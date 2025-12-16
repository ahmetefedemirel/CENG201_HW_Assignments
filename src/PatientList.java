public class PatientList {
    Patient head;   // Creating head pointer.

    public PatientList(){
        this.head = null;
    }

    public void addPatient(int id, String name , int severity, int age) {
        Patient newPatient = new Patient(id, name, severity, age);
        if (head == null) {
            head = newPatient;
        }
        else {
            newPatient.next = head;
            head = newPatient;
        }
    }

    public void removePatient(int id) {
        if (head == null) {
            throw new RuntimeException("Empty list");
        }
        Patient tempPatient = head; // current node
        Patient prev = null;    // to access previous node created prev pointer.
        while(tempPatient != null && tempPatient.id != id){ // searching for the node to be deleted.
            prev = tempPatient; // prev is tempPatient's previous node
            tempPatient = tempPatient.next; // that is why prev is tempPatient's previous node
        }
        prev.next = tempPatient.next;   // delete the node to be deleted.
    }

    public String findPatient(int id){
        if (head == null) {
            System.out.println("Empty list.");
        }
        Patient tempPatient = head;
        while(tempPatient != null){
            if(tempPatient.id == id){
                return tempPatient.name;
            }
            tempPatient = tempPatient.next;
        }
        return null;
    }

    public void printList(){
        Patient tempPatient = head;
        while(tempPatient != null){
            System.out.println(tempPatient.name);
            tempPatient = tempPatient.next;
        }
    }
}
