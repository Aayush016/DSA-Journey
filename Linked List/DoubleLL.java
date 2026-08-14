public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Add in DLL
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printForward() {
        System.out.print("Forward List: ");
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null");
    }

    public void removeLast() {
        // Case 1: The list is empty
        if (head == null) {
            return;
        }

        // Case 2: The list has only one element
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        // Case 3: The list has multiple elements
        tail = tail.prev; // Move the tail reference back by one node
        tail.next = null; // Sever the link to the old tail node
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printForward();
        dll.removeLast();
        dll.printForward();
    }
}
