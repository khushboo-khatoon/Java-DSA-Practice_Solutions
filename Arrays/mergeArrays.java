    import java.util.Arrays;
public class mergeArrays {

    public void mergeArrays(int a[], int b[]) {
        
        int i = a.length - 1;
        int j = 0;

        while (i >= 0 && j < b.length) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }

        // Sort both arrays after swapping
        Arrays.sort(a);
        Arrays.sort(b);

}
    public static void main(String[] args) {
        mergeArrays merger = new mergeArrays();
        int[] a = {1,5,8,7,9,10};
        int[] b = {2, 3};

        merger.mergeArrays(a, b);

        System.out.println("Array A after merging: " + Arrays.toString(a));
        System.out.println("Array B after merging: " + Arrays.toString(b));
    }
    
}
