public class _01_Count_of_Element {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if( max < arr[i]){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                count++;
            }
        }
        int ans = arr.length - count;
        System.out.println("Number of Count of Element : "+ans);
    }
}




