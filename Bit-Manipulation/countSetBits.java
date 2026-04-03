public class countSetBits {
 public static int countSet(int n) {
        // code here
        int count=0;
        while(n>0){
            n=n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 101
        int count = countSet(n);
        System.out.println("Number of set bits in " + n + " is: " + count); // Output: 2
    }
    
}
