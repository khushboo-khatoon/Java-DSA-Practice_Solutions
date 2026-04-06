package Stack;
import java.util.*;

public class usingLinkedlist {
     class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} 


    int size;
    Node top;

    public usingLinkedlist() {
        
        size=0;
        top=null;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(top==null){
            return true;
        }
        return false;
    }

    public void push(int x) {
      
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
        size++;
        
    }

  public void pop() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }
    top = top.next;
    size--;
}
    public int peek() {
       
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }

    public int size() {

        return size;
    }

    public static void main(String[] args) {
        usingLinkedlist stack = new usingLinkedlist();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek()); // Output: 30
        System.out.println("Stack size: " + stack.size()); // Output: 3
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek()); // Output: 20
        System.out.println("Stack size after pop: " + stack.size()); // Output: 2
    }
}
