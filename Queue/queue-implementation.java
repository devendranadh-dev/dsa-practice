class QueueDemo {
    int[] queue = new int[100];
    int front = 0, rear = -1;

    public void enqueue(int data) {
        if (rear == 99) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = data;
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        front++;
    }

    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.peek()); // 10
        q.dequeue();
        System.out.println(q.peek()); // 20
    }
}
