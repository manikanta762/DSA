import java.util.*;
//insert at End position..
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertatEEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head=null,tail=null;
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail = newNode;
            }
        }
        System.out.println("enter the new value we want to be inserted:");
        int val = sc.nextInt();
        Node neww= new Node(val);
         tail.next = neww;
         tail =neww;
        Node abc = head;
        System.out.println();
        while(abc.next!=null){
            System.out.print(abc.data + "->");
            abc=abc.next;
        }
        System.out.println(abc.data);
        sc.close();
    }
       
}
