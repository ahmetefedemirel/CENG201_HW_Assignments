public class TestQueue {
    public static void main(String[] args) {
        TreatmentQueue newQueue = new TreatmentQueue();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        newQueue.enqueue(5);
        newQueue.enqueue(6);
        newQueue.enqueue(7);
        newQueue.enqueue(8);    // Adding 8 treatment requests.


        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();     // Dequeue 3 requests.


        newQueue.printQueue();  // Printing the remaining queue.

    }
}
