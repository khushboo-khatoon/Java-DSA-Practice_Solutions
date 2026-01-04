class Single_number{
       public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Single_number obj=new Single_number();
        int[] arr={1,1,1,3,3};

       int ans= obj.singleNumber(arr);
       System.out.println(ans);
    }
}