public class _28_Good_SubArray {

    public static int goodSubArray(int[] A, int B){
        int count = 0;
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i <A.length; i++){
            int sum = 0;
            for (int j = i; j < A.length; j++){
                sum += A[j];
                if(( j-i+1 ) % 2 == 0 & sum < B ){
                    count++;
                } else if (( j-i+1 ) % 2 == 1 & sum > B) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int B = 4;
        int count = goodSubArray(arr, B);
        System.out.println("--- Good Subarray ---");
        System.out.println("\nTotak number of good subarray count is "+count);

    }
}
