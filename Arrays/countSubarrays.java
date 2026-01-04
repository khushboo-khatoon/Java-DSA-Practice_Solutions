
public class countSubarrays {
      long countSubarray(int arr[], int n, int k) {

        // code here
        long pos=0,res=0;
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                pos=i+1;
            }
            res+=pos;
        }
        return res;
        
    }
    public static void main(String[] args) {
        countSubarrays cs=new countSubarrays();
        int arr[]={1,2,3,4};
        int n=arr.length;
        int k=1;
        long result=cs.countSubarray(arr,n,k);
        System.out.println("The count of subarrays is: "+result);
    }

    
}
