

public class SecLargestElem {

   public int getSecondLargest(int[] arr) {
        int max=arr[0];
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
        }
        if(secmax==Integer.MIN_VALUE){
            return -1;
        }
        return secmax;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 7, 3, 2, 2, 4};
        SecLargestElem obj = new SecLargestElem();
        int secondLargest = obj.getSecondLargest(array);
      System.out.println("The second largest element in the array is: " + secondLargest);
    }
    
}
