class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MiddleElement {
    public static int middlelement(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next =  new Node(40);
        head.next.next.next = new Node(50); 
        head.next.next.next.next = new Node(60);
        head.next.next.next.next.next = new Node(70);
        System.out.println(middlelement(head));   
    }
}
