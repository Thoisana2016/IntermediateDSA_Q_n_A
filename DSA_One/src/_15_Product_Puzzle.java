public class _15_Product_Puzzle {

    public static int[] productPuzzle(int[] arr){
        int size = arr.length;
        int[] res = new int[size];
        int[] prefix = new int[size];
        int[] suffix = new int[size];
        prefix[0] = 1;
        for (int i = 1; i < size; i++){
            prefix[i] = prefix[i-1] * arr[i-1];
        }

        suffix[size-1] = 1;
        for (int i = size-2; i >= 0; i--){
            suffix[i] = suffix[i+1] * arr[i+1];
        }

        for (int i = 0;i < size; i++){
            res[i] = prefix[i] * suffix[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("--- ORIGINAL ARRAY ---");
        for (int n : arr){
            System.out.print(" "+n);
        }
        System.out.println();
        int[] ans = productPuzzle(arr);
        System.out.println("Product puzzle array ");
        for (int a : ans){
            System.out.print(" "+a);
        }
    }
}
