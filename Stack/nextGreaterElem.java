import java.util.ArrayList;
import java.util.Stack;

public class nextGreaterElem {
    
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st=new Stack<>();

        for(int i = n-1 ; i >=0; i--){
          
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                
                if(st.isEmpty()){
                    ans.add(0,-1);
                }
                else{
                    ans.add(0,st.peek());
                }
             st.push(arr[i]);
            
        }

        return ans;
    }
    public static void main(String[] args) {
        nextGreaterElem obj = new nextGreaterElem();
        int[] arr = {4, 5, 2, 10};
        ArrayList<Integer> result = obj.nextLargerElement(arr);
        System.out.println(result); // Output: [5, 10, 10, -1]
    }

}
