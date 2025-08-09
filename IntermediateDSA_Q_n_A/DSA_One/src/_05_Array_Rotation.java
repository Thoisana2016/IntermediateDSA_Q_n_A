public class _05_Array_Rotation {
    public static int[] reverseArray(int[] arr, int start, int end){
        while (start <= end ){
            int x = arr[start];
            arr[start] = arr[end];
            arr[end] = x;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        int[] res = reverseArray(arr, 0, n-1);
        res = reverseArray(res, 0, k-1);
        res = reverseArray(res, k,n-1);

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        System.out.println("--- ARRAY BEFORE ROTATION ---");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        int[] res  = rotateArray(arr, k);
        System.out.println();
        System.out.println("--- Rotated Array ---");
        for (int i = 0; i< arr.length; i++){
            System.out.print(" "+arr[i]);
        }

    }
}
