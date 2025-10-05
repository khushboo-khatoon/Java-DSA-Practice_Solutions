package Arrays;
public class LargestElem {

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 7, 9, -8, -9};
        int largest = findLargest(array);
        System.out.println("The largest element in the array is: " + largest);
    }
}