package String;

public class reverse_word {
        public String reverseWords(String s) {
        
        StringBuilder sb=new StringBuilder();
        String[] words=s.split(" +");
        int i=words.length-1;
        while(i>=0){
           sb.append(words[i]);
           sb.append(" ");
           i--;
        }

        return sb.toString().trim();
    }
    public static void main(String[] args) {
        reverse_word obj = new reverse_word();
        String s = "Hello World";
        String result = obj.reverseWords(s);
        System.out.println("Reversed words: " + result); // Output: "World Hello"
    }
    
}
