public class TreatmentQueue {
    int size;


    private static class Node{
        TreatmentRequest treatmentRequest;
        Node next;
        Node(TreatmentRequest treatmentRequest){
            next = null;
            this.treatmentRequest = treatmentRequest;
        }
    }

    private Node head;  // Creating head pointer
    private Node tile;  // Creating tile pointer for the last element of the list.

    public TreatmentQueue(){
        head = null;
        size = 0;
    }

    public Node getHead(){
        return head;
    }


    public void enqueue(TreatmentRequest request){      // Enqueue method FIFO behavior. (First in First out).
        Node newTreatment = new Node(request);    // Creating new TreatmentRequest object.
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

    public TreatmentRequest dequeue(){  // Delete the patient which at the beginning of the queue.
        if(head == null){
            throw new RuntimeException("Empty queue."); // if head is null, print "Empty queue"
        }
        TreatmentRequest treatmentRequest = head.treatmentRequest;
        head = head.next;
        size--;
        return treatmentRequest;
    }

    public int size(){
        return size;
    }   // Return size.

    public void printQueue(){   // Print queue by ID.
        Node temp = head;
        System.out.println("At the beginning of the queue");
        while(temp != null){
            System.out.println(temp.treatmentRequest.patientId);
            temp = temp.next;
        }
    }
}
