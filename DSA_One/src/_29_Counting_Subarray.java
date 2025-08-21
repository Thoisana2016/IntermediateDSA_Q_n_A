public class _29_Counting_Subarray {

    public static int countSubArray(int[] arr, int B){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            int sum =0;
            for (int j = i; j< arr.length; j++){
                sum += arr[j];
                if (sum < B){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 11, 2, 3, 15};
        int B = 10;
        int ans = countSubArray(arr, B);
        System.out.println("--- Counting Subarray ---");
        System.out.println("\nTotal number of counting subarray : "+ans);
    }
}
