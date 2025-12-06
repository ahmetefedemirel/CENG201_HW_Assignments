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
            tile.next = newTreatment;
            tile = newTreatment;
        }
        size++;
    }

    public void dequeue(){
        if(head == null){
            throw new RuntimeException("Empty queue.");
        }
        else{
            head = head.next;
            size--;
        }
    }

    public int size(){
        return size;
    }

    public void printQueue(){
        TreatmentRequest temp = head;
        while(temp != null){
            System.out.println(temp.patientId);
            temp = temp.next;
        }
    }
}
