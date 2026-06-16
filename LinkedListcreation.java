//this is the basic creation linked list and traversing...
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
class LinkedListcreation{
     public static void main(String[] args) {
        Node head = new Node(30);
        head.next = new Node(40);
        head.next.next = new Node(60);
        head.next.next.next = new Node(90);
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
     }
}