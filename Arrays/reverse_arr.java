<<<<<<< HEAD

=======
Time Complexity = O(n)  |  Space Complexity = O(n)
>>>>>>> e4fbb32265fbbbf5186831d4211b5914d9c0540b
package Arrays;
// Reverse an array | Time Complexity: O(N) | Space Complexity: O(1)
public class reverse_arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] arr) {
         int n=arr.length;
        int[] temp=new int[n];
       for(int i=0;i<n/2;i++){
           temp[i]=arr[i];
           arr[i]=arr[n-1-i];
           arr[n-i-1]=temp[i];
       }
    }
}
