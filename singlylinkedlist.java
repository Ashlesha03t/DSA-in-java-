public class singlylinkedlist {

    // Node class to represent each element in the list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Head node of the linked list
    Node head;

    // Method to insert elements at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) {
        singlylinkedlist list = new singlylinkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }
}

