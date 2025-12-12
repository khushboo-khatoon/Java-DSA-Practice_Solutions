package Arrays;
// Java program to find union of two arrays | Time Complexity: O((n + m) log(n + m)) | Space Complexity: O(n + m)


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class unionOfTwoArr {
      public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set=new TreeSet<>();
        
        for(int num1:a){
            set.add(num1);
        }
        
        for(int num2:b){
            set.add(num2);
            
        }
        return new ArrayList<>(set);
}

    public static void main(String[] args) {
        int[] array1 = {1, 4, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        ArrayList<Integer> result = findUnion(array1, array2);
        System.out.println("Union of the two arrays: " + result);
    }
}