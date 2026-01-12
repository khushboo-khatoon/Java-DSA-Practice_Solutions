class rotateMatrix {
    public static void matrixx(int mat[][]){
        int n=mat.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;

            
            }
        }

        for(int i=0;i<n;i++){
            int left=0,right=n-1;

            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }


        }
    }
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        matrixx(matrix); 

                for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }




        
    }


    
}
