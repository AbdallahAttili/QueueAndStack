public class Stack {
    private final int MAX;
    private int top;
    private final int [] stack;

    public Stack(){
        this.MAX = 1000;
        this.top = -1;
        this.stack = new int [MAX];
    }

    boolean isEmpty(){
        return top < 0;
    }

    boolean isFull(){
        return top >= this.MAX - 1;
    }

    int size(){
        return top + 1;
    }

    boolean push(int n){
        if(isFull()){
            System.out.println("overflow issue.");
            return false;
        } else{
            stack[++top] = n;
            return true;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("underflow issue.");
            return 0;
        } else{
            return stack[top--];
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("There is no elements in the stack.");
            return 0;
        } else{
            return stack[top];
        }
    }

    void print(){
        for(int i = top; i > -1; i--){
            System.out.println(stack[i] + " ");
        }
    }


}
