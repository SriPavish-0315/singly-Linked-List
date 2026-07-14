class Node{
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}
public class Singlyib{
    Node head = null;
    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void traverse(){
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }   
    public static void main(String[] args){
        Singlyib list = new Singlyib();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List:");
        list.traverse();
    }
}