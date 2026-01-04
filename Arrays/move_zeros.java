

// Move all zeros to the end of the array | Time Complexity: O(n) | Space Complexity: O(1)

public class move_zeros {
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int count = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // Increment count
            }
        }

       
        while (count < n) {
            arr[count++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 0, 0, 3, 5, 6, 0, 0, 8, 7};
        moveZeros(arr);
        System.out.print("Array after moving all zeros to the end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
