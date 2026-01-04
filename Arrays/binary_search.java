
// binary search to find first occurrence of an element in array | Time Complexity: O(log N) | Space Complexity: O(1)

import java.util.Arrays;

public class binary_search {
    public int binarysearch(int[] arr, int k) {
        Arrays.sort(arr); // sort first
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == k){
                ans = mid;        // possible first occurrence
                high = mid - 1;   // continue searching left
            } else if(arr[mid] < k){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 5, 1, 3};
        int target = 3;
        binary_search obj = new binary_search();
        int result = obj.binarysearch(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

