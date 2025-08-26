import java.io.FileOutputStream;

public class _33_Main_Diagonal_Sum {

    //HERE ARRAY WILL HAVE
    public static int mainDiagonalSum(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int diagSum =0;
        for (int i = 0; i < row; i++){
            for (int j = i; j < col; j++){
                if (i == j){
                    diagSum += arr[i][j];
                }
            }
        }
        return diagSum;
    }


    public static void main(String[] args) {
        int[][] arr = { {1,-2, -3}, { -4, 5, -6}, {-7, -8, 9}};
        int res = mainDiagonalSum(arr);
        System.out.println("=== MAIN DIAGONAL SUM ===");
        System.out.print("\n Main Diagonal Sum of the 2d Array  :"+res);
    }
}
