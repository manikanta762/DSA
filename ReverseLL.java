import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ReverseLL {
    public static void revserse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr= next;
        }
        Node temp = prev;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp = temp.next; 
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        Node head = null,tail =null;
    Scanner sc = new Scanner(System.in);
    System.out.print("how many nodes you want :");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("enter the Nodes: ");
      int val = sc.nextInt();
      Node newNode = new Node(val);
      if(head==null){
        head = newNode;
        tail= newNode;
      }
      else{
        tail.next = newNode;
        tail = newNode;
      }
    } 
     revserse(head);
    sc.close();
}
}
