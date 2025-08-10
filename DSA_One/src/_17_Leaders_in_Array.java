public class _17_Leaders_in_Array {

    public static int leadersInArray(int[] arr){
        int count = 1;
        int max = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--){
            if (max < arr[i]){
                max = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int res = leadersInArray(arr);
        System.out.println("--- LEADERS IN ARRAY ---");
        System.out.println("Number of leaders in array : "+res);
    }
}
