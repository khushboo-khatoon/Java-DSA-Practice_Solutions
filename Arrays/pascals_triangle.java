// pascal's triangle ||  time complexity: O(n) || space complexity: O(n)    
package Arrays;

import java.util.ArrayList;

public class pascals_triangle {
     ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        int value=1;
        ans.add(value);
        
        for(int i=1;i<n;i++){
            value=value*(n-i)/i;
            ans.add(value);
            
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int n = 5; // Example row number
        ArrayList<Integer> res= new pascals_triangle().nthRowOfPascalTriangle(n);
        System.out.println("The " + n + "th row of Pascal's Triangle is: " + res);
    }
    
}
