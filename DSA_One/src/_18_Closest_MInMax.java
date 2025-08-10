import java.sql.SQLOutput;

public class _18_Closest_MInMax {

    public static int closestMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int minIdx = -arr.length;
        int maxIdx = -arr.length;
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        if( max == min){
            return 1;
        }
        int size = arr.length;
        for (int i = 0; i <arr.length; i++){
            if (arr[i] == max){
                maxIdx = i;
                int tmp = maxIdx - minIdx;
                size = Math.min(size, tmp);
            }
            else if(arr[i] == min){
                minIdx = i;
                int tmp = minIdx - maxIdx;
                size = Math.min(size, tmp);
            }
        }
        return size+1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 6, 9};
        int ans = closestMinMax(arr);
        System.out.println("--- CLOESEST MIN MAX IN ARRAY ---");
        System.out.println("The minimum length that contains min and max of an array is : "+ans);
    }
}
