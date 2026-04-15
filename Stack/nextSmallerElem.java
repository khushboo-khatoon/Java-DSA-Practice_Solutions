import java.util.*;

class nextSmallerElem {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
            // code here
            ArrayList<Integer> ans =new ArrayList<>();
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<arr.length;i++){
                ans.add(-1);
                
            }
            
            for(int i=arr.length-1;i>=0;i--){
                 while(!st.isEmpty() && st.peek()>=arr[i]){
                     st.pop();
                 }    
                 if(!st.isEmpty()){
                     
                     ans.set(i,st.peek());
                 }
             
                 st.push(arr[i]);
            }
            return ans;
            
            
            
            
        }
        public static void main(String[] args) {
            int[] arr={4,5,2,10,8};
            System.out.println(nextSmallerEle(arr));
        }

    
}