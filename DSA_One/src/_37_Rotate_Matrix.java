public class _37_Rotate_Matrix {

    public static int[][] rotate(int[][] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
        for (int i = 0; i < n; i++){
            int left = 0;
            int right = n -1;
            while (left < right){
                int tmp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = tmp;
                left++;
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] res = rotate(arr);
        System.out.println("=== ROTATE ARRAY ===");
        System.out.println();
        for (int i = 0; i < res.length; i++){
            for (int j = 0; j < res[0].length; j++){
                System.out.print("\t "+res[i][j]);
            }
            System.out.println("");
        }
    }
}
