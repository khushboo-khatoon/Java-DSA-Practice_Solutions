
// time Complexity = O(n log n) ||  Space Complexity = O(n)
package Arrays;

public class mergeSort {

    void merge_sort(int arr[], int l, int r) {
        // code here
        // l=>lb  r=>up
        //to devide the array
        if(l<r){
            int mid = l + (r - l) / 2;  //finding mid
            
            merge_sort(arr,l,mid);// divide left sublist
            
            merge_sort(arr,mid+1,r); //divide right sublist 
            
            merge(arr,l,mid,r);//merging 
            
        }

    }

    // to merge the array 

           void merge(int arr[], int l, int mid, int r) {

        // temporary array 
        int arr2[] = new int[r - l + 1];

        int i = l;        // start of left subarray
        int j = mid + 1;  // start of right subarray
        int k = 0;        // index for arr2 (starts from 0)

        // merging both sorted halves
        
          while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                arr2[k] = arr[i];
                i++;
            } else {
                arr2[k] = arr[j];
                j++;
            }
            k++;
          }
          
           while (i <= mid) {
            arr2[k] = arr[i];
            i++;
            k++;
        }

        // copy remaining elements from right half
        while (j <= r) {
            arr2[k] = arr[j];
            j++;
            k++;
        }
        
        
        //  to the original array
      int t=0;
        for (int x = l; x <= r; x++) {
            arr[x] = arr2[t];
        
            t++;
        }
           }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int n = arr.length;                 
        mergeSort ms = new mergeSort();
        ms.merge_sort(arr, 0, n - 1);
        System.out.println("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
