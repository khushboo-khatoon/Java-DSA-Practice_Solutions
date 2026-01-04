
// Java program to find the intersection of two arrays | Time Complexity: O(n + m) | Space Complexity: O(min(n, m))
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfTwoArr {
  ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
       Set<Integer> set=new TreeSet<>();
       ArrayList<Integer> res=new ArrayList<>();
        
        for(int num1:arr1){
            set.add(num1);
        }
        
        for(int num2:arr2){
            if(set.contains(num2)){
                res.add(num2);
            set.remove(num2);
            }
            
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 2};
        IntersectionOfTwoArr obj = new IntersectionOfTwoArr();
        ArrayList<Integer> result = obj.intersection(array1, array2);
        System.out.println("Intersection of the two arrays: " + result);
    }
}
