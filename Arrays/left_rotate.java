package Arrays;
// Left rotate an array | Time Complexity: O(N) | Space Complexity: O(1

public class left_rotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; //position
        leftRotate(arr, d);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // if d>n
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
