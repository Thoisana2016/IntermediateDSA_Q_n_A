public class _12_In_Place_Prefix_Sum {

    public static int[] prefixSum(int[] arr){
        int size = arr.length;

        for(int i = 1; i < size; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("--- PREFIX SUM USING THE GIVEN ARRAY ITSELF ---");
        System.out.println(" Original Array is : ");
        for (int n : arr){
            System.out.print(" "+n);
        }
        System.out.println();
        int[] res = prefixSum(arr);
        System.out.println("Prefix Sum Array is : ");
        for (int n : res){
            System.out.print(" "+n);
        }
        return;
    }
}
