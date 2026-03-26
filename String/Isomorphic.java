package String;

import java.util.HashMap;

public class Isomorphic {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
    
        HashMap<Character,Character> map=new HashMap<>();
        int i=0;


        while(i<s1.length() && i<s2.length()){
            char ori=s1.charAt(i);
            char copy=s2.charAt(i);
             if(!map.containsKey(ori)){
                if( !map.containsValue(copy)){
                    map.put(ori,copy);

                }
                else{

                return false;
                }

            }
            else if(map.get(ori)!=copy){
                return false;
            }
            i++;
        }
       
        return true;
        
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        Isomorphic obj = new Isomorphic();
        boolean result = obj.areIsomorphic(s1, s2);
        System.out.println("Are the strings isomorphic?\n"+"Answer: " + result); // Output: true    
    }
}
