public class TreatmentQueue {
    Node head;  // Creating head pointer
    Node tile;  // Creating tile pointer for the last element of the list.
    int size;

    public TreatmentQueue(){
        head = null;
        size = 0;
    }


    public void enqueue(Patient patient){      // Enqueue method FIFO behavior. (First in First out).
        Node newTreatment = new Node(patient);    // Creating new TreatmentRequest object.
        if(head == null){   // Checking head is null or not.
            head = newTreatment;
            tile = newTreatment; // if head is null, automatically tile is null, too.
        }
        else{
            tile.next = newTreatment;   // Adding new element at the final of the queue.
            tile = newTreatment;
        }
        size++;
    }

    public Patient dequeue(){  // Delete the patient which at the beginning of the queue.
        if(head == null){
            throw new RuntimeException("Empty queue."); // if head is null, print "Empty queue"
        }
        Patient patient = head.patient;
        head = head.next;
        size--;
        return patient;
    }

    public int size(){
        return size;
    }   // Return size.

    public void printQueue(){   // Print queue by ID.
        Node temp = head;
        System.out.println("At the beginning of the queue");
        while(temp != null){
            System.out.println(temp.patient.id);
            temp = temp.next;
        }
    }
}
