

import java.util.Stack;

public class infixToPostfix {
    public static int priority(char ch){
        if(ch=='^') return 3;
        if(ch=='/' || ch=='*') return 2;
        if(ch=='+' || ch=='-') return 1;
        else return -1;
    }
    public static String infix_to_Postfix(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            
            char ch=s.charAt(i);
            
            if((ch>='A' && ch<='Z') ||
            (ch>='a' && ch<='z')  ||
             (ch>='0' && ch<='9')
            ){
               sb.append(ch); 
            }
            else if(ch == '('){
                st.push(ch);
                
            }
             else if(ch == ')'){
                 while(!st.isEmpty() && st.peek()!='('){
                     sb.append(st.peek());
                     st.pop();
                 }
                 
                st.pop();
                
            }
            else{
                while(!st.isEmpty() && 
                    ( ( priority(st.peek())>priority(ch)) ||
                     (priority(ch) == priority(st.peek()) && ch != '^') )
                     )
                {
                    sb.append(st.peek());
                    st.pop();
                }
                st.push(ch);
            }
            i++;
            
            
        }
        
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        
        return sb.toString();
        
    }
    public static void main(String[] args) {
        String infix = "A+B*C-D";
        String postfix = infix_to_Postfix(infix);
        System.out.println("Postfix expression: " + postfix); // Output: ABC*+D-
    }

    
}
