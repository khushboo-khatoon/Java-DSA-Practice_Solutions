// insertion Sort  | Time Complexity: O(n²)  | Space Complexity: O(1)
public class insertionSort {
     public void insertion(int arr[]) {
        // code here
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        insertionSort is=new insertionSort();
        int arr[]={5,4,3,2,1};
        is.insertion(arr);
        System.out.println("The sorted array is: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
