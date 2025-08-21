public class _25_Maximum_Subarray_Easy {

    public static int maxSubArraySum(int A, int B,int[] C){
        int sum = 0;
        int maxNum = 0;
        int size = C.length;
        if (A == 1){
            return C[0];
        }
        for (int i = 0; i < A; i++){
            sum = 0;
            for (int j = i; j < A; j++){
                sum += C[j];
                if (sum > B){
                    continue;
                }
                if (sum > maxNum){
                    maxNum = sum;
                }
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] C = {2, 1, 3, 4, 5};
        int A = 5, B = 12;
        int ans = maxSubArraySum(A, B, C);
        System.out.println("--- Maximum Subarray Sum ---");
        System.out.println();
        System.out.println("Maximum Subarray sum of the given array : "+ans);
    }
}
