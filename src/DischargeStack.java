public class DischargeStack {
    DischargeRecord top;    // Creating top poiter.

    public DischargeStack(){    // Constructor
        this.top = null;
    }


    public void push(int patientId){    // push() method runs by LIFO behavior (First In Fırst Out)
        DischargeRecord record = new DischargeRecord(patientId);    // Creating new object.
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
            System.out.println(top.patientId);
        }
    }

    public void printStack(){   // Printing the stack.
        DischargeRecord temp = top;
        while(temp != null){
            System.out.println(temp.patientId);
            temp = temp.next;
        }
    }
}
