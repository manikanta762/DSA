import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Insertionll {
    public static void main(String[] args) {
     System.out.println("enter no of nodes:");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     Node head = null,tail=null;
     for(int i=0;i<n;i++){
        System.out.println("enter the value: ");
        int val = sc.nextInt();
        Node newNode = new Node(val);
           if(head==null){
            tail=head= newNode;
           }
           else{
            tail.next=newNode;
            tail=newNode;
           }
     }
       int value = sc.nextInt();
       Node newNode  = new Node(value);
       newNode.next =head;
       head = newNode;

            Node temp = head;
            System.out.println("the result is: ");
            while(temp.next!=null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
            }
            System.out.println(temp.data);
        // Node head = new Node(20);
        // head.next = new Node(30);
        // head.next.next = new Node(40);
        // Node newNode = new Node(10);
        // if(head==null){
        //     head = newNode;
        // }        
        // else{
        //     newNode.next = head;
        //     head = newNode;
        // }
        // Node  temp = head;
        // while(temp!=null){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
    sc.close();
 }
}