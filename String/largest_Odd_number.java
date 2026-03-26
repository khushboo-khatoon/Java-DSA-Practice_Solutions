package String;

public class largest_Odd_number {
        public String largestOddNumber(String num) {
        int n=num.length()-1;
        while(n>=0){
            int d=num.charAt(n)-'0';
            if(d%2==1){
                return num.substring(0,n+1);
            }
            n--;
        }
        return "";
        
    }
    public static void main(String[] args) {
        String num = "53";
        largest_Odd_number obj = new largest_Odd_number();
        String result = obj.largestOddNumber(num);
        System.out.println("Largest odd number is : " + result); // Output: "5"
        
    }

}
