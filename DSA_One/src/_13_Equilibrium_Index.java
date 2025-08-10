public class _13_Equilibrium_Index {

    public static int equilibriumIndex(int[] arr){

        int count = 0;
        //creating prefixSum
        int[] pfSum = new int[arr.length];
        pfSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            pfSum[i] = pfSum[i-1] + arr[i];
        }
        //check and count equilibrium index
        int left, right = 0;
        for (int i = 0; i < arr.length; i++){
            if (i == 0) left =0;
            else {
                left = pfSum[i-1];
                right = pfSum[arr.length-1] - pfSum[i];
            }
            if (left == right){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int res = equilibriumIndex(arr);
        System.out.println("--- ORIGINAL ARRAY ---");
        for (int n : arr){
            System.out.print(" "+n);
        }
        System.out.println();
        System.out.println("The number of equilibrium index : "+res);
        return;
    }
}
