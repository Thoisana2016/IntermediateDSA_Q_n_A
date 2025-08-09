public class _06_Min_Max_Array {

    public static void maxMinArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min in arr is "+min+" and Max in array is :"+max);
        System.out.println("SUM OF MIN AND MAX IS : "+(max + min));
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -4, 5, 3};
        maxMinArray(arr);
    }
}
