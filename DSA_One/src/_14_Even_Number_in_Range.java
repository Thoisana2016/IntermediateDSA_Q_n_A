public class _14_Even_Number_in_Range {

    public static int[] evenNumberinRange(int[] arr, int[][] range){

        int[] evenArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0)
                evenArray[i] = 1;
            else
                evenArray[i] = 0;
        }

        for (int i = 1; i < evenArray.length; i++){
            evenArray[i] = evenArray[i-1] + evenArray[i];
        }
        
        int[] res = new int[range.length];
        for (int i = 0; i <range.length; i++){
            int si = range[i][0];
            int ei = range[i][1];

            if (si == 0)
                res[i] = evenArray[ei];
            else
                res[i] = evenArray[ei] - evenArray[si-1];
        }

        return res;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[][] range = {{0,2},{2,4},{1,4}};
        System.out.println("--- ORIGINAL ARRAY ---");
        for (int n : arr){
            System.out.print(" "+n);
        }
        System.out.println();
        int[] ans = evenNumberinRange(arr,range);
        System.out.println("Event number in range : ");
        for (int n : ans){
            System.out.print(" "+n);
        }
        return;
    }
}
