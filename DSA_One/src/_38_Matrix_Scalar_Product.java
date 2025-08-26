public class _38_Matrix_Scalar_Product {

    public static int[][] matrixScalarProduct(int[][] arr, int b){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] *= 2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int b = 2;
        System.out.println("=== Before Matrix Scalar Product (ORIGINAL ARRAY) ===");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print("\t "+arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("=== Matrix Scalar Product ===");

        arr = matrixScalarProduct(arr, b);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print("\t "+arr[i][j]);
            }
            System.out.println("");
        }
    }
}
