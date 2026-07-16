class Node {
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

public class Singlyds {
    Node head = null;
    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void deleteSpecificValue(int key) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        if (head.data == key) {
            head = head.next;
            System.out.println("Deleted: " + key);
            return;
        }
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == key) {
                prev.next = temp.next;
                System.out.println("Deleted: " + key);
                return;
            }

            prev = temp;
            temp = temp.next;
        }
        System.out.println("Value " + key + " not found.");
    }

    void traverse() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Singlyds list = new Singlyds();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(45);
        list.insert(50);
        System.out.println("Original List:");
        list.traverse();
        System.out.println();
        list.deleteSpecificValue(20);
        System.out.println("After Deleted The Key ");
        list.traverse();
    }
}