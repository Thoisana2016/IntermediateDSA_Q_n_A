public class _10_Time_to_Equality {

    public static int timeToEquality(int[] arr){
        int min = Integer.MIN_VALUE;
        int step = 0;
        for(int i = 0; i < arr.length; i++){
            if(min < arr[i]){
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                step = step + (min -arr[i]);
            }
        }
        return step;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2};
        int res = timeToEquality(arr);
        System.out.println("--- TIME TO EQUALITY ---");
        System.out.println("Equality step : "+res);
    }
}
