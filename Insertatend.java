import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Insertatend {
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
        System.out.println("Enter the position of element: ");
        int pos = sc.nextInt();
        Node temp=head;
        Node prev =null;
        for(int i=0;i<pos-1;i++){
             prev = temp;
             temp=temp.next;    
        }
        System.out.println("enter the new value we want to be inserted:");
        int val = sc.nextInt();
        Node neww= new Node(val);
        neww.next = temp;
          prev.next = neww;
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
