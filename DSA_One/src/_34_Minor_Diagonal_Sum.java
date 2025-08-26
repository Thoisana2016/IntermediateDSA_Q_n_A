public class _34_Minor_Diagonal_Sum {


    public static int minorSum(int[][] arr){
        int row = arr.length;
        int sum = 0;
        for (int i = 0, j = row-1; i < row; i++, j--){
            sum += arr[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
        int ans = minorSum(arr);
        System.out.println("=== MINOR DIAGONAL SUM ===");
        System.out.println("\nThe minor sum of the array : "+ans);
    }
}
