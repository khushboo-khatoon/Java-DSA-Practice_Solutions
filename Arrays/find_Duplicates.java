

import java.util.ArrayList;
import java.util.Arrays;

public class find_Duplicates {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer>  res=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                res.add(arr[i]);
                
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        find_Duplicates obj = new find_Duplicates();
        ArrayList<Integer> result = obj.findDuplicates(array);
        System.out.println("The duplicate elements in the array are: " + result);
    }
}
