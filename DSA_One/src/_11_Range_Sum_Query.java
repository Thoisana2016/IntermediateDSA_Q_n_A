import java.sql.SQLOutput;

public class _11_Range_Sum_Query {

    public static int[] rangeSum(int[] num, int[][] range){
        int[] pSum = new int[num.length];
        int[] res = new int[range.length];

        pSum[0] = num[0];
        for(int i = 1; i < num.length; i++){
            pSum[i] = pSum[i-1] + num[i];
        }

        for(int i = 0; i < range.length; i++){
            int m = range[i][0];
            int n = range[i][1];
            if (m == 0){
                res[i] = pSum[n];
            }
            else {
                res[i] = pSum[n] - pSum[m-1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] B = {{0,3},{1,2}};

        int[] res = rangeSum(arr, B);
        System.out.println("--- RANGE SUM QUERY USING PREFIX SUM ---");
        System.out.println("\n Result of range sum query :");
        for (int n : res){
            System.out.println(" "+n);
        }
        return;
    }
}
