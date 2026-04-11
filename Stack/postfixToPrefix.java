// Convert postfix to prefix expression | Time Complexity: O(n²) | Space Complexity: O(n)

package Stack;

import java.util.Stack;

public class postfixToPrefix {
  static String postToPre(String post_exp) {
        // code here
           Stack<String> st=new Stack<>();
       
        int i=0;
        int n=post_exp.length();
        while(i<n){
            char ch=post_exp.charAt(i);
            
            if((ch>='A' && ch<='Z') ||
              (ch>='a' && ch<='z')  ||
              (ch>='0' && ch<='9')) {
                  st.push((String.valueOf(ch)));
              }
            else{
                String t1=st.peek();
                st.pop();
                String t2=st.peek();
                st.pop();
               String concat=ch+t2+t1 ;
               st.push(concat);
            }  
            
            i++;
            
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String post_exp="AB+CD-*";
        System.out.println(postToPre(post_exp));
    }

    
}
