public class _03_Reverse_in_Range {

    public static int[] reverseRange(int[] arr, int B, int C){
        while(B <= C){
            int temp = arr[B];
            arr[B] = arr[C];
            arr[C] = temp;
            B++; C--;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int start = 2;
        int end = 3;
        System.out.println("Original array before reverse : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        int[] res = reverseRange(arr, start, end);
        System.out.println("Reverse array in a range : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
