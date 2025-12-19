public class TestStack {
    public static void main(String[] args) {
        DischargeStack newStack = new DischargeStack();     // Creating newStack object.

        newStack.push(new Patient(132, "Ahmet Şimşek", 3, 21));
        newStack.push(new Patient(132, "Ahmet Şimşek", 3, 21));
        newStack.push(new Patient(132, "Ahmet Şimşek", 3, 21));
        newStack.push(new Patient(132, "Ahmet Şimşek", 3, 21));
        newStack.push(new Patient(132, "Ahmet Şimşek", 3, 21));// Adding 5 discharge records.


        newStack.pop();
        newStack.pop();     // Popping 2 items by LIFO rule.


        newStack.printStack();  // Printing remaining stack.

    }
}
