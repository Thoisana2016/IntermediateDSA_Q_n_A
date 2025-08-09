public class _09_Range_Sum_Query {

    public static int[] rangeSum(int[] arr,int[][] range){
        int[] totalSum = new int[range.length];
        for(int i = 0;i < range.length; i++){
            int m = range[i][0];
            int n = range[i][1];
            int sum = 0;
            for(int j = m; j <= n; j++){
                sum += arr[j];
            }
            totalSum[i]= sum;
        }
        return totalSum;
    }


    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 3}, {1, 2}};

        int[] res = rangeSum(A, B);
        System.out.println("--- RANGE SUM QUERY ---");
        System.out.println();
        for (int n : res){
            System.out.println(" "+n);
        }
    }
}
