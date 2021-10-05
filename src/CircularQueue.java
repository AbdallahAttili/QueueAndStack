public class CircularQueue {
    private int rear;
    private int front;
    private int length;
    private final int[] queue;
    private final int maxSize;

    public CircularQueue(int size) {
        if (size <= 0) {
            maxSize = 100;
        } else {
            maxSize = size;
        }

        this.front = 0;
        this.queue = new int[maxSize];
        this.rear = maxSize - 1;
        this.length = 0;
    }

    boolean isEmpty() {
        return length == 0;
    }

    boolean isFull() {
        return length == maxSize;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("You can't add another value . *QUEUE IS FULL*.");
        } else {
            rear = (rear + 1) % maxSize;
            queue[rear] = value;
            length++;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("There are on values in the queue to remove.");
        } else {
            front = (front + 1) % maxSize;
            length--;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("There are no values in the queue to get");
            System.exit(0);
        }

        return queue[front];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("There are on values in the queue .");
        } else {
            for (int i = front; i != rear ; i = (i + 1) % maxSize) {
                System.out.print(queue[i] + " ");
            }
            System.out.print(queue[rear]);
        }
    }

    int search(int element) {
        int index = -1;

        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            for (int i = front; i != rear; i = (i + 1) % maxSize) {
                if (queue[i] == element) {
                    index = i;
                }

                if(queue[rear] == element){
                    index = rear;
                }
                break;
            }
        }

        return index;
    }


}
