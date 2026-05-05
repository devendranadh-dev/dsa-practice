class ReverseLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next; // store next
            curr.next = prev;      // reverse link
            prev = curr;           // move prev
            curr = next;           // move curr
        }

        head = prev;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.print("Before: ");
        list.display();

        list.reverse();

        System.out.print("After: ");
        list.display();
    }
}
