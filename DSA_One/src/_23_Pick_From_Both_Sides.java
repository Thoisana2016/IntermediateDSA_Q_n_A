public class _23_Pick_From_Both_Sides {

    public static int pickFromBothSide(int[] num, int B){
        int n = num.length;
        int maxSum = Integer.MIN_VALUE;
        //prefix sum
        int[] prefixSum = new int[B+1];
        prefixSum[0] = 0;
        for (int i = 1; i <= B; i++){
             prefixSum[i] = prefixSum[i-1] + num[i-1];
        }

        //suffic sum
        int[] suffixSum = new int[B+1];
        suffixSum[0] = 0;
        for(int i = 1; i <= B; i++){
            suffixSum[i] = suffixSum[i-1] + num[n-i];
        }

        for(int i = 0; i <= B; i++){
            int currentSum = prefixSum[i] + suffixSum[B -i];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 3 , 1, 2};
        int B = 3;
        int ans = pickFromBothSide(arr, B);
        System.out.println("--- Pick up from both side ---");
        System.out.println("Result :"+ans);

    }
}
