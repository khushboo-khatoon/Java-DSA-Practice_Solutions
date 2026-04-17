

public class atoi {
    public static void main(String[] args) {
        String s="   -42";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
    s=s.trim(); // trim down the space 
        int sign=1;
        int digit=0;
        int i=0;
        if(s.length()==0){
            return digit;
        }
        if(s.charAt(0)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+'){
            i++;
        }
      
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch<'0' || ch>'9'){  
                break;
            }
          
          
            
             if(digit>(Integer.MAX_VALUE-(ch-'0'))/10){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
             }
            
              digit=digit*10+ch-'0';
             
            i++;
        }
        
        return sign*digit;
    }
    
}
