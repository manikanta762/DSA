import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Detect_loop {
    public static boolean detect(Node head){
        Node fast = head;
        Node slow  = head;

        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow = slow.next;
         if(slow == fast) return true;
        }
       return false;
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
           head.next.next.next = head.next;
       System.out.println( detect(head));
        sc.close();

    }
}
