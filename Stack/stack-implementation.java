class StackDemo {
    int[] stack = new int[100];
    int top = -1;

    public void push(int data) {
        if(top == 99) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    public void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackDemo s = new StackDemo();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
