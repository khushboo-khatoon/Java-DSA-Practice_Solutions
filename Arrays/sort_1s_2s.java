
public class sort_1s_2s {
     public void sort012(int[] arr) {
        int num1=0,num2=0,num3=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==0){
                num1++;
            }
            else if (arr[i]==1){
                num2++;
            }
            else if(arr[i]==2){
                num3++;
            }
        }
        
        
        for(int i=0;i<arr.length;i++){
            if(i<num1){
                arr[i]=0;
            }
            else if(i<(num1+num2) ){
            arr[i]=1;
            
        }
        else{
            arr[i]=2;
        }
        }
            
        }



        public static void main(String[] args) {
            int[] arr={0,2,1,2,0,1,0,2,1,1,0};
            sort_1s_2s obj=new sort_1s_2s();
            obj.sort012(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
}
