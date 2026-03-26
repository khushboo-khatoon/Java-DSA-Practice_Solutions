
package String;
public class palindrom_check {
      public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr=s.toCharArray();
            int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
          if(arr[low]!=arr[high]){
            return false;
          }
          else{
            low++;
            high--;
          }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "hii, iih";
        palindrom_check obj = new palindrom_check();        
        boolean result = obj.isPalindrome(s);
        System.out.println("Is the string a palindrome? " + result); // Output: true    

}


}
