public class TestStack {
    public static void main(String[] args) {
        DischargeStack newStack = new DischargeStack();     // Creating newStack object.

        newStack.push(new DischargeRecord(345));
        newStack.push(new DischargeRecord(654));
        newStack.push(new DischargeRecord(890));
        newStack.push(new DischargeRecord(909));    // Deleted 2nd
        newStack.push(new DischargeRecord(574));    // Adding 5 discharge records.


        newStack.pop();
        newStack.pop();     // Popping 2 items by LIFO rule.


        newStack.printStack();  // Printing remaining stack.

    }
}
