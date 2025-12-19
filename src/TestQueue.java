public class TestQueue {
    public static void main(String[] args) {
        TreatmentQueue newQueue = new TreatmentQueue();
        newQueue.enqueue(new Patient(132, "Ahmet Şimşek", 3, 21));
        newQueue.enqueue(new Patient(232, "Mehmet Çakırcı", 5, 23));
        newQueue.enqueue(new Patient(436, "Murat Sakallı", 6, 24));
        newQueue.enqueue(new Patient(365, "Ali Cihan", 10, 21));
        newQueue.enqueue(new Patient(675, "Mert Yıldırım", 4, 21));
        newQueue.enqueue(new Patient(965, "Kaan Ünal", 7, 21));
        newQueue.enqueue(new Patient(987, "Fatma Ertürk", 9, 21));
        newQueue.enqueue(new Patient(142, "Sevgi Çiçek", 3, 21));  // Adding 8 treatment requests.


        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();     // Dequeue 3 requests.


        newQueue.printQueue();  // Printing the remaining queue.

    }
}
