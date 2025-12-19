public class TestLinkedList {
    public static void main(String[] args) {
        PatientList newList = new PatientList();    // Implementing newList.
        newList.addPatient(new Patient(132, "Ahmet Şimşek", 3, 21));
        newList.addPatient(new Patient(232, "Mehmet Çakırcı", 5, 23));
        newList.addPatient(new Patient(436, "Murat Sakallı", 6, 24));
        newList.addPatient(new Patient(765, "Ali Yılmaz", 8, 25));
        newList.addPatient(new Patient(245, "Cemre Batur", 9, 65));
        // Adding 5 patients to the newList.

        newList.printList();    // Printing the inital list.

        newList.removePatient(515);     // Removing one of them by ID.

        System.out.println(newList.findPatient(184));   // Finding patient by ID and printing it's name.

        newList.printList();    // Printing the final list.
    }
}
