package Queue;

public class usingLL {
    class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

    Node start,end;
    int size;

    public usingLL() {

        start=null;
        end=null;
        size=0;
    
    }

    public boolean isEmpty() {
  
        if(start==null){
            return true;
        }
        else{
        return false;
        }
    }

    public void enqueue(int x) {
      
        Node temp=new Node(x);
        if(isEmpty()){
           start=temp;
           end=temp;
        }
        else{
        end.next=temp;
        end=temp;
    
        }
    
        size++;
    }

    public void dequeue() {
    
        if(isEmpty()){
            start=end;
        }
        else{
        start=start.next;
        size--;
        }
    }

    public int getFront() {
      
        if(start==null){
            return -1;
        }
        else{
            return start.data;
        }
    }

    public int size() {
        
        return size;
    }

    public static void main(String[] args) {
        usingLL queue = new usingLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.getFront());
        System.out.println("Queue size: " + queue.size());

        queue.dequeue();
        System.out.println("Front element after dequeue: " + queue.getFront());
        System.out.println("Queue size after dequeue: " + queue.size());
    }
    
}

