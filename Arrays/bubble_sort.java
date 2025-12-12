package Arrays;
// Bubble Sort Algorithm | Time Complexity: O(N^2) | Space Complexity: O(
public class bubble_sort {
       public void bubbleSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
                
            }
        }
    }
    public static void main(String[] args) {
        bubble_sort bs=new bubble_sort();
        int arr[]={5,4,3,2,1};
        bs.bubbleSort(arr);
        System.out.println("The sorted array is: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
