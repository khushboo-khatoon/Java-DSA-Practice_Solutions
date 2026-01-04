
import java.util.ArrayList;
import java.util.List;
public class generateSubarrays {

    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            
            
            for(int j=i;j<arr.length;j++){
            
            ArrayList<Integer> sub=new ArrayList<>();
            
            for(int k=i;k<=j;k++){
                sub.add(arr[k]);
            }
            
            res.add(sub);
                
            }
     
     
        }
        return res;
        
        
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        generateSubarrays obj = new generateSubarrays();
        List<List<Integer>> result = obj.getSubArrays(array);
        System.out.println("The subarrays are: " + result);
    }
}
