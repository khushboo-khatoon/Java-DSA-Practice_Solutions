
public class Imple_stack_Array {

    int[] arr;
    int top;
    int size;

    public Imple_stack_Array(int n) {
        arr = new int[n];
        top = -1;
        size = n;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Imple_stack_Array stack = new Imple_stack_Array(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30

        stack.pop();
        System.out.println("Top element after pop: " + stack.peek()); // 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // false
        System.out.println("Is stack full? " + stack.isFull()); // false
    }
}