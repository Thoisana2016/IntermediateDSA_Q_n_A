public class _21_Even_SubArray {

    //carryFowrard Not working
    public static int evenSubArray(int[] arr){
        int size = arr.length;
        boolean carryForward = false;
        if (size == 1){
            return 0;
        }
        for (int i = 0; i < size; i++){
            if (arr[i] % 2 == 0){
                if (!carryForward)
                    carryForward = true;
                else
                    carryForward = false;
            }

        }
        return carryForward? 1 : 0;
    }
    //not working

    public static String evenSubarray(int[] arr){
        int size = arr.length;
        String str = "NO";
        if (size == 0)
            return "Yes";
        else if ((size % 2 == 0) && (arr[0]%2 == 0) && (arr[size-1] %2 ==0) ){
            return "Yes";
        }
        else {
            return "No";
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 6};
        int res  = evenSubArray(arr);
        System.out.println("--- EVEN SUBASRRAY ---");
        System.out.println("(Using carry forward )is the array even subarray : "+res);
        System.out.println("(Uithout using carryforward,) even sub-array ?"+evenSubarray(arr));
    }
}
