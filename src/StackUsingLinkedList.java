import static java.lang.System.exit;

public class StackUsingLinkedList {

    private class Node {
        int data;
        Node link;
    }

    Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(int n) {
        Node temp = new Node();

        if (temp == null) {
            System.out.println("Heap overflow");
            return;
        }

        temp.data = n;
        temp.link = top;
        top = temp;
    }

    boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("There are not elements in the stack.");
            return 0;
        }


        return top.data;
    }

    public boolean pop() {
        if (isEmpty()) {
            System.out.println("Under flow issue");
            return false;
        }

        top = top.link;
        return true;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Sack underflow");
            exit(1);
        } else{
            Node temp = top;
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.link;
            }
        }
    }
}
