import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        String res = "";

        for(int i = 0; i < num.length(); i++) {
            while(!st.isEmpty() && k > 0 && num.charAt(i)-'0' < st.peek()-'0') {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        while(k > 0) {
            st.pop();
            k--;
        }

        if(st.isEmpty()) {
            return "0";
        }

        while(!st.isEmpty()) {
            res = res + st.peek();  
            st.pop();
        }

        StringBuilder sb = new StringBuilder(res);
        String ans = sb.reverse().toString();

        int i = 0;

        while(i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        ans = ans.substring(i);
        if(ans.length() == 0) {
            return "0";
        }

        return ans;
    }


    public static void main(String[] args) {
      RemoveKDigits obj = new RemoveKDigits();

        String num = "1432219";
        int k = 3;

        String result = obj.removeKdigits(num, k);

        System.out.println("Smallest number after removing " + k + " digits: " + result);
        
    }
    
}
