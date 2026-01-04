// Find if there exists a pair with sum equal to given target in an array | Time Complexity: O(N log N) | Space Complexity: O(1)

import java.util.Arrays;

public class PairSum {
       boolean twoSum(int arr[], int target) {
            Arrays.sort(arr);
        int i = 0, j= arr.length - 1;
        while (i <j) {
            int sum = arr[i] + arr[j];

            if (sum == target)
                return true;
            else if (sum < target)
            
                i++; 
            else
            
                j--;
        }
        return false;
    }
    public static void main(String[] args) {
        PairSum ps = new PairSum();
        int[] arr = {10, 15, 2, 7};
        int target = 17;
        boolean result = ps.twoSum(arr, target);
        System.out.println("Pair with the given sum " + target + " exists: " + result);
    }

    
}
