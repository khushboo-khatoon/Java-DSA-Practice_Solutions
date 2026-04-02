
public class numberIsPowerOf2 {
        public static boolean isPowerofTwo(int n) {
       
        if(n==0){
            return false;
        }
        if((n & n-1)==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerofTwo(n));
    }
}

