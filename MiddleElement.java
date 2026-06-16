import java.util.*;
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
                tail=newNode;
            }
            
        }
        System.out.println(middlelement(head));   
        sc.close();
    }
}
