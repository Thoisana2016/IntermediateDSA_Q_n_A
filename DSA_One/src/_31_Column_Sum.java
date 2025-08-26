import java.util.Arrays;

public class _31_Column_Sum {

    public static int[] columnSum(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[] sumCol = new int[col];
        System.out.println("Row : "+row+", column :"+col);
        int tmp = 0;
        int[] colSum = new int[col];
        for (int j = 0; j < col; j++){
            for (int i = 0; i < row; i++) {
                sumCol[j] += arr[i][j];
            }
        }
        return sumCol;//new int[]{};
    }


    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int[] res = columnSum(arr);
        System.out.println("--- Coulumn Sum ---");
        for (int n : res){
            System.out.print(" \t "+n);
        }
    }

}
