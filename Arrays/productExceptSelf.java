
public class productExceptSelf {
      public static int[] productExcept_Self(int arr[]) {
             int[] result=new int[arr.length];
        result[0]=1;
        for(int i=1;i<arr.length;i++){  //for the left product
            result[i]=result[i-1]*arr[i-1];
        }
    
        
        int right=1;
        for(int i=arr.length-1;i>=0;i--){
            result[i]=result[i]*right;  //for the right product
        
            right*=arr[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int arr[]= {10, 3, 5, 6, 2};
        int[] result=productExcept_Self(arr);
        System.out.print("The product of array except self is: ");
        for(int i:result){
            System.out.print(i+" ");
        }
    }   
    
}
