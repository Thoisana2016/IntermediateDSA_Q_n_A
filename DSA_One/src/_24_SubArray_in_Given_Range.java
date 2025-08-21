public class _24_SubArray_in_Given_Range {
    public static int[] subarrayRange(int[] arr, int B, int C){
        int[] newArr = new int[C-B+1];
        int j = 0;
        for ( int i = B; i <= C; i++){
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,6};
        int B = 1, C = 3;

        int[] res = subarrayRange(arr, B, C);
        System.out.println("--- Subarray in given Range ---");
        System.out.println();
        for (int i : res){
            System.out.print("\t "+i);
        }
    }
}
