package Queue;
public class imple_using_LL {

    int size;
    Node top;

    class Node {
        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    public imple_using_LL() {
        size = 0;
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        top = top.next;
        size--;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        imple_using_LL stack = new imple_using_LL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
    }
}