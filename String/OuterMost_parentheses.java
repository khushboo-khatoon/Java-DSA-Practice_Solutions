package String;
public class OuterMost_parentheses {
     public String removeOuterParentheses(String s) {
       
        int n=s.length();
      StringBuilder res = new StringBuilder(); 
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                if(count>1){
                    res.append(ch);
                }
            }
            else{
                count--;
                  if(count>0){
                      res.append(ch);
                   
                }
            }

        }
     return   res.toString();
       
      
        
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        OuterMost_parentheses obj = new OuterMost_parentheses();
        String result = obj.removeOuterParentheses(s);
        System.out.println("Result is : " + result); // Output: "()()()"
        
    }
}
