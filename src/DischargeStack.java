public class DischargeStack {

    private static class Node{
        DischargeRecord record;
        Node next;
        Node(DischargeRecord record){
            this.record = record;
            next = null;
        }
    }

    private Node top;

    public DischargeStack(){    // Constructor
        this.top = null;
    }


    public void push(DischargeRecord record){    // push() method runs by LIFO behavior (First In Fırst Out)
        Node newNode = new Node(record);
        newNode.next = top;  // Pushing the new record.
        top = newNode;
    }

    public void pop(){  // Pop() method deletes the last record from the DischargeStack.
        if(top == null){
            System.out.println("Empty list.");
        }
        else{
            top = top.next; // Shifting the top element.
        }
    }

    public void peek(){ // peek() method prints the top record.
        if(top == null){
            System.out.println("Empty list.");
        }
        else{
            System.out.println(top.record.patientId);
        }
    }

    public void printStack(){   // Printing the stack.
        Node temp = top;
        while(temp != null){
            System.out.println(temp.record.toString());
            temp = temp.next;
        }
        System.out.println("At the bottom of stack");   // define the bottom of the stack
    }
}
