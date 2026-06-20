import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
//this is the length of the loop
public class Length_of_oop{
    public static int detect(Node head){
        Node fast = head;
        Node slow  = head;
        
        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow = slow.next;
            int c =1;
         if(slow == fast){
              slow = slow.next;
             while(slow!=fast){
                c=c+1;
                slow = slow.next;
             }
             return c;
         }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);
           if(head==null){
            head = newNode;
            tail = newNode;
           }
           else{
            tail.next = newNode;
            tail = newNode;
           }
        }
           head.next.next.next.next.next = head.next;
       System.out.println( detect(head));
        sc.close();

    }
}
