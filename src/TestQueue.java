public class TestQueue {
    public static void main(String[] args) {
        TreatmentQueue newQueue = new TreatmentQueue();
        newQueue.enqueue(new TreatmentRequest(123));
        newQueue.enqueue(new TreatmentRequest(456));
        newQueue.enqueue(new TreatmentRequest(678));
        newQueue.enqueue(new TreatmentRequest(987));
        newQueue.enqueue(new TreatmentRequest(434));
        newQueue.enqueue(new TreatmentRequest(498));
        newQueue.enqueue(new TreatmentRequest(132));
        newQueue.enqueue(new TreatmentRequest(234));  // Adding 8 treatment requests.


        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();     // Dequeue 3 requests.


        newQueue.printQueue();  // Printing the remaining queue.

    }
}
