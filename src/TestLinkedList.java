public class TestLinkedList {
    public static void main(String[] args) {
        PatientList newList = new PatientList();    // Implementing newList.
        newList.addPatient(313,"Ali", 3, 21);
        newList.addPatient(515,"Ahmet", 4, 56);
        newList.addPatient(425,"Ayşe", 1, 34);
        newList.addPatient(987,"Veli", 2, 46);
        newList.addPatient(184,"Murat", 5, 49); // Adding 5 patients to the newList.

        newList.printList();    // Printing the inital list.

        newList.removePatient(515);     // Removing one of them by ID.

        System.out.println(newList.findPatient(184));   // Finding patient by ID and printing it's name.

        newList.printList();    // Printing the final list.
    }
}
