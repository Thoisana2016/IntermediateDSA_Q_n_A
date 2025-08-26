public class _42_Row_to_Column_Zero {

    public static int[][] rowColZero(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] tmp = new int[row][col];
        //copying A to tmp
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                tmp[i][j] = arr[i][j];
            }
        }

        //updating the array or replacing each and ever row with 0 for every arr[i][j] = 0; ith row and j column
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (arr[i][j] == 0){
                    for (int k = 0; k < row; k++){
                        tmp[k][j] = 0;
                    }
                    for (int k = 0; k < col; k++){
                        tmp[i][k] = 0;
                    }
                }
            }
        }
        // no need to update arr, we can return tmp array itself without updating arr it's a waste of time
        //updating the arr using tmp
        for (int i = 0; i < row; i++){
            for (int j =0; j < col; j++){
                arr[i][j] = tmp[i][j];
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,0},{9,2,0,4}};
        System.out.println("=== ORIGINAL ARRAY ===");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[0].length; j++){
                System.out.print("\t "+arr[i][j]);
            }
            System.out.println("");
        }

        System.out.println("=== ROW TO COLUMN ZERO ===");
        arr = rowColZero(arr);
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j<arr[0].length; j++){
                System.out.print("\t "+arr[i][j]);
            }
            System.out.println("");
        }
    }
}
