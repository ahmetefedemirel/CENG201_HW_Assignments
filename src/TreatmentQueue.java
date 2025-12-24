public class TreatmentQueue {
    int size;
    TreatmentQueue emergency;
    TreatmentQueue normal;


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

    public  TreatmentQueue(boolean forPriorityQueues){  // Second constructor for priority.
        head = null;
        size = 0;
        if(forPriorityQueues){  // If priority queue;
            emergency = new TreatmentQueue();   // Create new queue for emergency patients.
            normal = new TreatmentQueue();  // Create new queue for normal patients.
        }
    }

    public Node getHead(){  // Return head for HospitalSystem class.
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

    public int size(){  // Return size.
        return size;
    }

    public void printQueue(TreatmentQueue treatmentQueue){  // Print queue for normal requests.
        Node temp = head;
        System.out.println("At the beginning of the queue");
        while(temp != null){
            System.out.println(temp.treatmentRequest.patientId);
            temp = temp.next;
        }
    }

    public void enqueueByPriority(TreatmentRequest request){    // Enqueue by priority.
        if(request.priority){   // If it is emergency request
            emergency.enqueue(request); // Add the request to emergency queue.
        }
        else{
            normal.enqueue(request);    // Add the request to normal queue.
        }
    }

    public void printQueueByPriority(){ // Print the queue by priority.
        Node temp = emergency.head; // Node temp holds emergency.head
        System.out.println("At the beginning queue.");
        while (temp != null){   // Check temp is null or not.
            System.out.println(temp.treatmentRequest.toString());
            // print the request's id and arrival time.
            temp = temp.next;   // Shifting the temp.
        }
        temp = normal.head; // Now, temp holds normal.head
        while(temp != null){    // Check temp is null or not.
            System.out.println(temp.treatmentRequest.toString());
            // print the request's id and arrival time.
            temp = temp.next;   // Shifting the temp
        }
    }

    public TreatmentRequest dequeuePriority(){  // dequeue method for priority queue.
        if(emergency.head != null){
            return emergency.dequeue();
        }
        else if(normal.head != null){
            return normal.dequeue();
        }
        else{
            throw new RuntimeException("Empty queue");
        }
    }
}
