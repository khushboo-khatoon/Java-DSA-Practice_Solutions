package Arrays;

import java.util.ArrayList;
import java.util.List;

public class first&last_occur {
      ArrayList<Integer> find(int arr[], int x) {
        // code here
    int first=-1;
    int last=-1;
        
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
            if(first==-1){
                first=i;
            }
            last=i;
            }
        }
        res.add(first);
        res.add(last);
        return res;      
        
        
    }

    public static void main(String[] args) {
        first&last_occur obj = new first&last_occur();
        int[] array = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        ArrayList<Integer> result = obj.find(array, target);
        System.out.println("First and Last Occurrence of " + target + ": " + result);
    }
    
}
