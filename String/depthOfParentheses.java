package String;

public class depthOfParentheses {
        public int maxDepth(String s) {
        int level=0;
        int maxLevel=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                level++;
                maxLevel=Math.max(level,maxLevel);
            }
            else{
                if(s.charAt(i)==')')
                level--;
            }
        }
        return maxLevel;
    }
    public static void main(String[] args) {
        depthOfParentheses dp = new depthOfParentheses();
        String s = "(1+(2*3)+((8)/4))+1";
        int result = dp.maxDepth(s);
        System.out.println("Maximum depth of parentheses in the string is: " + result); // Output: 3
    }
}
