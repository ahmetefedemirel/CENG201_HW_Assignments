public class TestStack {
    public static void main(String[] args) {
        DischargeStack newStack = new DischargeStack();     // Creating newStack object.

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);   // Adding 5 discharge records.


        newStack.pop();
        newStack.pop();     // Popping 2 items by LIFO rule.


        newStack.printStack();  // Printing remaining stack.

    }
}
