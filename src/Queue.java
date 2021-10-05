public class Queue {
    private int index;
    private int[] queue;
    private int front;

    public Queue() {
        this.index = -1;
        this.queue = new int[11];
        this.front = 0;
    }

    public boolean isFull() {
        return index == queue.length - 1;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public int enqueue(int x) {
        if (isFull()) {
            System.err.println("Overflow issue");
            return 0;
        }

        queue[++index] = x;

        return x;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.err.println("Underflow issue");
            return 0;
        }
        front++;
        return queue[index--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("the queue is empty.");
        }

        return queue[front];
    }

    public int size() {
        return index + 1;
    }

}
