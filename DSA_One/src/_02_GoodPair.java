public class _02_GoodPair {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 7;
        int res = 0;
        for(int i=0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if (i == j) continue;
                if(arr[i] + arr[j] == target){
                    res = 1;
                }
            }
        }
        System.out.println("=== GOOD PAIR ===");
        System.out.println("The result : "+res);

        System.out.println("NOW CALLING, OPTIMIZED ONE : ");
        System.out.println("The result : "+optimizeLogic(arr, target));
    }


    public static int optimizeLogic(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return  1;
                }
            }
        }
        return 0;
    }
}
