package String;

import java.util.Arrays;

public class Anagram_String {
       public boolean isAnagram(String s, String t) {
        char[] arr1=s.toCharArray();
        char[]  arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(s.length()!=t.length()){
            return false;
        }
    int i=0;
    while(i<arr1.length && i<arr2.length){
        if(arr1[i]!=arr2[i]){
            return false;
        }
        i++;
    }
    return true;

        
    }
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        Anagram_String obj = new Anagram_String();
        boolean result = obj.isAnagram(s, t);
        System.out.println("Are the strings anagrams? " + result); // Output: true    
    }
}
