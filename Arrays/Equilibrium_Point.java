package Arrays;
// Equilibrium Point in an array  | Time Complexity: O(n) | Space Complexity: O(1)

public class Equilibrium_Point {
    public static int findEquilibrium(int arr[]) {
        int left_sum = 0;
        int total = 0;

        for (int num : arr) {
            total += num;
        }

        for (int i = 0; i < arr.length; i++) {
            int right_sum = total - left_sum - arr[i];

            if (left_sum == right_sum) {
                return i ;  
            }

            left_sum += arr[i];
        }

        return -1;
    }


public static void main(String[] args) {
    int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
   int equilibriumIndex = findEquilibrium(arr);
    if (equilibriumIndex != -1) {
        System.out.println("Equilibrium point found at index: " + equilibriumIndex);
    } else {
        System.out.println("No equilibrium point found.");
    }
}
    
}
