import java.util.HashMap;
import java.util.Map;

public class mejority_element {
    public static int majorityElement(int[] nums) {
                int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int k:nums){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>n/2){
                return e.getKey();
                
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,2,2};
        int ans=majorityElement(arr);
        System.out.println("the majority element greater then n/2 is "+ans );
    }
    
}
