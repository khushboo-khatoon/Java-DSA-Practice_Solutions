

import java.util.ArrayList;

public class max_min_Elem {
      public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        ArrayList<Integer> res=new ArrayList<>();
  
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        res.add(min);
        res.add(max);
        return res;
    }


    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7};
        max_min_Elem obj = new max_min_Elem();
        ArrayList<Integer> result = obj.getMinMax(array);
        System.out.println("The minimum element in the array is: " + result.get(0));
        System.out.println("The maximum element in the array is: " + result.get(1));
    }
}



