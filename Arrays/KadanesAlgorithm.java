//  Time Complexity of Kadane’s Algorithm: O(n)  | Space Complexity: O(1)
public class KadanesAlgorithm {
    // Kadane's Algorithm
    public static int findMaxSubarraySum(int[] arr) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            MaxSum = Math.max(MaxSum, currSum);
        }

        return MaxSum;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};
        int maxSum = findMaxSubarraySum(arr);   
        System.out.println("the maximum sum of subarray is "+maxSum);

        
    }



}
