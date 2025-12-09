public class Patient {
    int id;
    String name;
    int severity;
    int age;
    Patient next;   // Creating the next pointer.

    public Patient(int id, String name , int severity, int age){
        next = null;
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }
}
