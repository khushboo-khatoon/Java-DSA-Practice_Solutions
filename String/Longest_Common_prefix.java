package String;

import java.util.Arrays;

public class Longest_Common_prefix {
       public String longestCommonPrefix(String[] strs) {
          if(strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        int n=strs.length;
        String s1=strs[0];
        String s2=strs[n-1];
        int i=0,j=0;
      
       StringBuilder sb=new StringBuilder();
  
        while(i<s1.length() && j<s2.length()){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(j);
            if(ch1==ch2){
                sb.append(ch1);

            }
            else{
                break;
            }
            i++;
            j++;
        }
        return sb.toString();
        
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight","fly"};
        Longest_Common_prefix obj = new Longest_Common_prefix();
        String result = obj.longestCommonPrefix(strs);
        System.out.println("Longest common prefix is : " + result); // Output: "fl"
        
    }
}
