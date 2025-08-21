public class _26_Sum_of_all_SubArray {

    public static long sumOfSubArray(int[] A){
        long size = A.length;
        long sum = 0;
        long totalSum = 0l;
        for (int i = 0; i < size; i++){
            totalSum += (A[i]*(i+1) * (size-i));
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] A = {2, 1,3};
        long ans = sumOfSubArray(A);
        System.out.println("--- Sum of all subarray ---");
        System.out.println("");
        System.out.println(" Total Sum of all sub array : "+ ans);
    }
}
