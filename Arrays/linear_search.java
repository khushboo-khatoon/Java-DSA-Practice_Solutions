
// search an element in array | Time Complexity: O(N) | Space Complexity: O(1)

public class linear_search {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4, 2, 3, 5, 1};
        int target = 5;
        linear_search obj = new linear_search();
        int result = obj.search(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
    

