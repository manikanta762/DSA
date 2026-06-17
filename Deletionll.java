import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Deletionll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many nodes you want");
        int n = sc.nextInt();
        Node head = null,tail=null,prev=null;
        for(int i=0;i<n;i++){
             int val = sc.nextInt();
             Node newNode = new Node(val);
             if(head==null){
                tail=head=newNode;
             }
             else{
                //prev=tail; deletion at end..
                tail.next = newNode;
                tail=newNode;
             }
        }
        //prev.next = null; deletion at end...


        //deletion at beginning
        // if(head==null || head.next==null){
        //     System.out.println("linked list empty ");
        // }
        // else{
        //     head=head.next;
        // }

       System.out.println("enter the postion where you want to delete...");
        int pos = sc.nextInt();
        Node tempp = head;
        for(int i=0;i<pos-1;i++){
            prev = tempp;
             tempp = tempp.next;
        }
        prev.next = tempp.next;

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
        sc.close();
    }
}
