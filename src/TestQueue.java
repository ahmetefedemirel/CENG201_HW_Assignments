public class TestQueue {
    public static void main(String[] args) {

        // Task 2:
        TreatmentQueue newQueue = new TreatmentQueue();
        /*newQueue.enqueue(new TreatmentRequest(123));
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


        newQueue.printQueue(newQueue);*/  // Printing the remaining queue.


        // Task 4:
        TreatmentQueue q1 = new TreatmentQueue(true);
        q1.enqueueByPriority(new TreatmentRequest(123, false));
        q1.enqueueByPriority(new TreatmentRequest(435, true));
        q1.enqueueByPriority(new TreatmentRequest(987, false));
        q1.enqueueByPriority(new TreatmentRequest(765, true));
        q1.enqueueByPriority(new TreatmentRequest(598, true));
        q1.enqueueByPriority(new TreatmentRequest(375, false));
        q1.enqueueByPriority(new TreatmentRequest(367, true));
        q1.enqueueByPriority(new TreatmentRequest(962, false)); // Adding 8 treatment requests.

        q1.printQueueByPriority(); // Print the initial queue.

        q1.dequeuePriority();
        q1.dequeuePriority();
        q1.dequeuePriority();   // Dequeue 3 requests.

        q1.printQueueByPriority();  // Print the remaining queue.

    }
}
