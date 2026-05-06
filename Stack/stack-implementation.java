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

    public void peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top: " + stack[top]);
    }

    public void display() {
        for(int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackDemo s = new StackDemo();
        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
        s.display();
        s.peek();
    }
}
