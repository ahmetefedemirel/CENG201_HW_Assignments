public class TreatmentQueue {
    TreatmentRequest head;  // Creating head pointer
    TreatmentRequest tile;  // Creating tile pointer for the last element of the list.
    int size;

    public TreatmentQueue(){
        head = null;
        size = 0;
    }


    public void enqueue(int patientId){      // Enqueue method FIFO behavior. (First in First out).
        TreatmentRequest newTreatment = new TreatmentRequest(patientId);    // Creating new TreatmentRequest object.
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

    public void dequeue(){  // Delete the patient which at the beginning of the queue.
        if(head == null){
            throw new RuntimeException("Empty queue."); // if head is null, print "Empty queue"
        }
        else{
            head = head.next;   // Shifting the head.
            size--; // Decreasing the size.
        }
    }

    public int size(){
        return size;
    }   // Return size.

    public void printQueue(){   // Print queue by ID.
        TreatmentRequest temp = head;
        System.out.println("At the beginning of the queue");
        while(temp != null){
            System.out.println(temp.patientId);
            temp = temp.next;
        }
    }
}
