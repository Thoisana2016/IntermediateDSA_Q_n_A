public class _32_Row_Sum {


    public static int[] rowSum(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int[] sumRow = new int[row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                sumRow[i] += arr[i][j];
            }
        }
        return sumRow;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int[] res = rowSum(arr);
        System.out.println("=== Row Sum ===");
        for (int n : res){
            System.out.print("\t "+n);
        }
    }
}
