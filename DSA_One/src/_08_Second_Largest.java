public class _08_Second_Largest {
    public static int seconflargest(int[] arr){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr= {2, 4, 2};
        int res = seconflargest(arr);
        System.out.println("--- SECOND LARGETS ELEMENT ---");
        System.out.println("The second largest element is :"+res);
    }
}
