package LinkedList;

class imple_singlyLL {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        imple_singlyLL list = new imple_singlyLL();

        Node n1 = list.new Node(10);
        Node n2 = list.new Node(20);
        Node n3 = list.new Node(30);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}