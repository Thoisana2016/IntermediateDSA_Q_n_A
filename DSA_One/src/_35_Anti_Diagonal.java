public class _35_Anti_Diagonal {

    public static int[][] antiDiagonal(int[][] arr){
        int n = arr.length;
        int[][] res= new int[2*n-1][n];

        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n-i; j++){
                res[i+j][i] = arr[i][j];
            }
            for (int j = n-i, k = 1; j < n; j++, k++){
                res[i+j][i-k] = arr[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = antiDiagonal(arr);
        System.out.println("==== ANTI DIAGONAL IN ARRAY ====");
        int row = res.length;
        int col = res[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("\t "+res[i][j]);
            }
            System.out.println("");
        }
    }
}
