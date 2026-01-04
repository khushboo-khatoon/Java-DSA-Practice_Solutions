// Java program to set matrix zeros | Time Complexity: O(n*m) | Space Complexity: O(n + m)


import java.util.HashSet;

public class setMatrixZeros {
       public void setMatrixZeroes(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        HashSet<Integer> col=new HashSet<>();
        HashSet<Integer> row=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
         if(mat[i][j]==0){
             row.add(i);
             col.add(j);
         }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             if(row.contains(i)|| col.contains(j)){
                 mat[i][j]=0;
             }
            }
        }
        
        
    } 
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        setMatrixZeros obj = new setMatrixZeros();
        obj.setMatrixZeroes(matrix);
        System.out.println("Matrix after setting zeros:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
