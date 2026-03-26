package String;

public class RotateString {
        public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;

        }
        if((s+s).contains(goal)){
            return true;
        }
        return false;
    
      
       
    
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        RotateString obj = new RotateString();
        boolean result = obj.rotateString(s, goal);
        System.out.println("Can the string be rotated to match the goal? " + result); // Output: true    
    }
    
}
