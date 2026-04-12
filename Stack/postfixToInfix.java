// Time Complexity: O(n)
// Space Complexity: O(n)


import java.util.Stack;

public class postfixToInfix {
    static String postToInfix(String exp) {
        // code here
        Stack<String> st=new Stack<>();
       
        int i=0;
        int n=exp.length();
        while(i<n){
            char ch=exp.charAt(i);
            
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
               String concat='('+t2+ch+t1+')' ;
               st.push(concat);
            }  
            
            i++;
            
        }
        return st.peek();
        
        
    }
    public static void main(String[] args) {
        String post_exp="AB+CD-*";
        System.out.println(postToInfix(post_exp));
    }
    
}
