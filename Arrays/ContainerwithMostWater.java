// Java program to find the maximum water that can be contained | Time Complexity: O(n) | Space Complexity: O(1)
package Arrays;

public class ContainerwithMostWater {
    class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left=0,right=arr.length-1;
        int maxArea=0;
        
        while(left<right){
            int height=Math.min(arr[left],arr[right]);
            int width=right-left;
            int area=height*width;
          maxArea=Math.max(maxArea,area);
            if(arr[left]<arr[right]){
                left++;
                
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}

    public static void main(String[] args) {
        Solution sol = new ContainerwithMostWater().new Solution();
        int[] height = {2, 1, 8, 6, 4, 6, 5, 5};
        int result = sol.maxWater(height);
        System.out.println("The maximum water that can be contained is: " + result);
    }
    
}
