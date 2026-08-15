public class Reverse_LL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;

    // Method to reverse the Doubly Linked List
    public void reverse() {
        // Handle empty list or single-node list scenarios
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        Node temp = null;

        // Traverse the entire list and swap pointers
        while (current != null) {
            // Step A: Swap the next and prev pointers of the current node
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Step B: Move to the next node in the original sequence.
            // Since we just swapped pointers, current.prev now points to the original
            // 'next' node.
            current = current.prev;
        }

        // Step C: Update the head pointer to the new first node.
        // Before exiting the loop, 'temp' was set to the 'prev' of the old tail node,
        // which means 'temp.prev' points to the old tail node itself (the new head).
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Helper method to insert a node at the front
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // Helper method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Reverse_LL dll = new Reverse_LL();

        // Constructing list: 10 <-> 20 <-> 30 <-> 40
        dll.push(40);
        dll.push(30);
        dll.push(20);
        dll.push(10);

        System.out.print("Original List: ");
        dll.printList();

        dll.reverse();

        System.out.print("Reversed List: ");
        dll.printList();
    }
}
