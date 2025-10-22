import java.util.ArrayList;

public class first_last_occur {
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
        int[] array = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;
        first_last_occur obj = new first_last_occur();
        ArrayList<Integer> result = obj.find(array, x);
        System.out.println("First occurrence of " + x + " is at index: " + result.get(0));
        System.out.println("Last occurrence of " + x + " is at index: " + result.get(1));
    }
    
}
