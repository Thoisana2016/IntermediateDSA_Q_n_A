public class _40_Add_Matrices {

    public static int[][] addMatrices(int[][] A, int[][] B){
        int r1 = A.length, c1 = A[0].length;
        int r2 = B.length, c2 = A[0].length;
        if (r1 != r2 || c1 != c2 ){
            return new int[][]{}; //
        }
        for (int i = 0; i < r1; i++){
            for (int j = 0; j< c1; j++){
                A[i][j] += B[i][j];
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("=== ORIGINAL MATRICES ===");
        System.out.println(" MATRIX A");
        for (int i = 0; i < A.length; i++){
            for (int j =0; j < A[0].length;j++){
                System.out.print("\t "+A[i][j]);
            }
            System.out.println("");
        }

        System.out.println(" MATRIX B");
        for (int i = 0; i < A.length; i++){
            for (int j =0; j < A[0].length;j++){
                System.out.print("\t "+B[i][j]);
            }
            System.out.println("");
        }
        System.out.println("=== Add Matrices ===");
        A = addMatrices(A, B);
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                System.out.print("\t "+A[i][j]);
            }
            System.out.println("");
        }
    }
}
