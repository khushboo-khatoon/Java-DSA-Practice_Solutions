// occurrence of a element in array | Time Complexity:  O(n) | Space Complexity: O(1)
public class occurrence_elem {
      int countFreq(int[] arr, int target) {
        // code here
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                res++;
                
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 2, 5};
        int target = 2;
        occurrence_elem obj = new occurrence_elem();
        int frequency = obj.countFreq(array, target);
        System.out.println("The occurrence of " + target + " in the array is: " + frequency);
    }
}
