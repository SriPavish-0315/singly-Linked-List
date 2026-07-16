class Node{
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}
public class Singlys{
       Node head = null;
        void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    void Search(int key){
        if(head==null){
            System.out.println("Empty List");
        }
        else{
            Node temp=head;
            while(temp!=null){
                if(temp.data==key){
                    System.out.println("Key is Found: "+key);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Key is not Found");
        }
        
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
        Singlys list = new Singlys();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List:");
        list.traverse();
        list.Search(20);
        list.traverse();
    }
}
