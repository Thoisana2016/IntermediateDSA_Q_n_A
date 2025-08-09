public class _07_Linear_Search_Multiple_Occurance {

    public static int multipleOccurence(int[] A, int B){
        int count = 0;
        for (int i = 0; i < A.length; i++){
            if(A[i] == B){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 1};
        int B = 3;
        int res = multipleOccurence(num, B);
        System.out.println("--- Linear Search Multiple Count ---");
        System.out.println("Result : "+res);
    }
}
