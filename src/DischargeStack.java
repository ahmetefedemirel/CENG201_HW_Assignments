public class DischargeStack {
    Node top;    // Creating top poiter.

    public DischargeStack(){    // Constructor
        this.top = null;
    }


    public void push(Patient patient){    // push() method runs by LIFO behavior (First In Fırst Out)
        Node record = new Node(patient);    // Creating new object.
        record.next = top;  // Pushing the new record.
        top = record;
    }

    public void pop(){  // Pop() method deletes the last record from the DischargeStack.
        if(top == null){
            System.out.println("Empty list.");
        }
        else{
            top = top.next;
        }
    }

    public void peek(){ // peek() method prints the top record.
        if(top == null){
            System.out.println("Empty list.");
        }
        else{
            System.out.println(top.patient.id);
        }
    }

    public void printStack(){   // Printing the stack.
        Node temp = top;
        while(temp != null){
            System.out.println(temp.patient.id);
            temp = temp.next;
        }
        System.out.println("At the bottom of stack");
    }
}
