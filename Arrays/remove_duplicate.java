
package Arrays;
// remove duplicate from sorted array  | Time Complexity: O(N) | Space Complexity: O(N)

import java.util.ArrayList;

public class remove_duplicate {

    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        res.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                res.add(arr[i]);
                
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {2,2,2,2,2,3,4,4,5,5,5,6};
        remove_duplicate obj = new remove_duplicate();
        ArrayList<Integer> result = obj.removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + result);
    }
}