public class rearrange {
    public static  int[] rearrangeArray(int[] nums) {
        int negative=1;
        int positive=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[negative]=nums[i];
                negative+=2;
            }
            else{
                 ans[positive]=nums[i];
                positive+=2;
            }


        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr={1,-2,3,-3,-2,1};
       System.out.println( rearrangeArray(arr)); 
    
        

    }

    
}
