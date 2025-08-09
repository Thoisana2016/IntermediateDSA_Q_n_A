public class _04_Reverse_Array {
    public static int[] reverseArray(int[] arr){
        int i = 0, j = arr.length-1;
        while (i <= j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++; j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,10};
        System.out.println("=== ARRAY BEFORE REVERSE ===");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        int[] res = reverseArray(arr);
        System.out.println("=== REVERSE ARRAY ===");
        for (int i = 0; i < arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
