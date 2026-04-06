package LinkedList;

public class deletionOfHeadLL {
        class Node {
    int data;
    Node next;  
    Node(int new_data) {
        data = new_data;    
        next = null;
    }
}
 public Node deleteHead(Node head) {
   
        Node temp=head.next;
        return temp;
    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        deletionOfHeadLL list = new deletionOfHeadLL();
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        
        System.out.println("Original List:");
        printList(head);
        
        head = list.deleteHead(head);
        
        System.out.println("List after deleting head:");
        printList(head);
    }
    
}
