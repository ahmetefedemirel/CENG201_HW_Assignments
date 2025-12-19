public class PatientList {
    Node head;   // Creating head pointer.

    public PatientList(){   // Constructor
        this.head = null;
    }


    public void addPatient(Patient p) {   // Adding patient to beginning of the list.
        Node newNode = new Node(p);  // Creating new node object.
        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void removePatient(int id) {
        if (head == null) {
            throw new RuntimeException("Empty list");
        }

        if (head.patient.id == id) {    // If searching id is head, delete head.
            head = head.next;
            return;
        }

        Node current = head; // current node
        while(current.next != null){ // searching for the node to be deleted.
            if(current.next.patient.id == id){  // Checking the nodes which is not head
                current.next = current.next.next;   // Shifting the node which is not head.
                return;
            }
            current = current.next; // Shifting current iftself.
        }
    }

    public Patient findPatient(int id){  // Finding Patient by ID.
        if (head == null) {
            System.out.println("Empty list.");  // If head is null, print "Empty list."
        }
        Node tempPatient = head; // temp patient holds head.
        while(tempPatient != null){
            if(tempPatient.patient.id == id){
                return tempPatient.patient;    // Check tempPatient.id is equal to id or not.
            }
            tempPatient = tempPatient.next;
        }
        return null;
    }

    public void printList(){    // Print list method.
        Node tempPatient = head;
        while(tempPatient != null){
            System.out.println(tempPatient.patient.name);
            tempPatient = tempPatient.next;
        }
    }
}
