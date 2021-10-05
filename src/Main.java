public class Main {

    public static void main(String [] args){

        Queue queue = new Queue();

        queue.enqueue(2);
        queue.enqueue(2);
        queue.enqueue(2);
        queue.enqueue(2);
        queue.enqueue(2);

        System.out.println("Queue size : " + queue.size());
        System.out.println("is the queue empty : " + queue.isEmpty());

        System.out.println("is the queue full : " + queue.isFull());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Queue size : " + queue.size());


        System.out.println("=====================================================================");

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack's size : " + stack.size());
        System.out.println("Does the stack empty : " + stack.isEmpty());
        System.out.println("Does the stack full : " + stack.isFull());

        System.out.println("The first element in the stack is : " + stack.peek());

        stack.print();

        System.out.println("=======================================================================");


        StackUsingLinkedList stack1 = new StackUsingLinkedList();

        stack1.push(10);
        stack1.push(20);
        stack1.pop();
        stack1.push(30);
        stack1.push(40);
        stack1.pop();
        stack1.push(50);
        stack1.push(60);

        stack1.display();


        System.out.println("====================================================================================");


        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);

        System.out.println("Does the queue empty : " + circularQueue.isEmpty());

        System.out.println("Does the queue is full : " + circularQueue.isFull());

        System.out.println("First element in the queue : " + circularQueue.peek());

        System.out.println("Search for number 60 in any index : " + circularQueue.search(60));

        circularQueue.display();

        System.out.println();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();

        circularQueue.enqueue(300);
        circularQueue.enqueue(400);
        circularQueue.enqueue(500);

        circularQueue.display();

        System.out.println("\nFirst element : " + circularQueue.peek());

    }
}
