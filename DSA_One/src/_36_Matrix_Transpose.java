public class _36_Matrix_Transpose {

    public static int[][] matrixTranspose(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] res = new int[col][row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                res[j][i] = arr[i][j];
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] res = matrixTranspose(arr);
        System.out.println("=== MATRIX AFTER TRANSPOSE ===");
        for (int i = 0; i < res.length; i++ ){
            for (int j = 0; j < res[0].length; j++){
                System.out.print("\t "+res[i][j]);
            }
            System.out.println("");
        }
    }
}
