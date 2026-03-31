

public class ith_bit_setOrNot {
    static boolean checkKthBit(int n, int k) {
        // code here
        return (n & (1<<k))!=0;
    }
    public static void main(String[] args) {
        int n = 5; // Binary: 101
        int k = 0; // Check if the 0th bit is set
        boolean result = checkKthBit(n, k);
        System.out.println("Is the " + k + "th bit of " + n + " set? " + result); // Output: true
    } 
    
}
