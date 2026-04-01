
package LinkedList;
public class insertAThead_SLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    
    }
     public  Node insertAtFront(Node head, int x) {
        // code here
        Node temp=new Node(x);
        temp.next=head;
        return temp;
     }
    public static void main(String[] args) {
        insertAThead_SLL list = new insertAThead_SLL();

        Node n1 = list.new Node(10);
        Node n2 = list.new Node(20);
        Node n3 = list.new Node(30);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        head=list.insertAtFront(head,5);

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}

