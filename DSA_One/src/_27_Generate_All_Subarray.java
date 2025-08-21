import java.util.ArrayList;

public class _27_Generate_All_Subarray {

    public static ArrayList<ArrayList<Integer>> generateAllSubArray(ArrayList<Integer> A){
        int n = A.size();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int s = 0; s < n; s++){
            for (int e = s; e < n; e++){
                ArrayList<Integer> insideList = new ArrayList<>();
                for (int i = s; i<=e ; i++){
                    insideList.add(A.get(i));
                }
                list.add(insideList);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer>num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        ArrayList<ArrayList<Integer>> arr = generateAllSubArray(num);
        System.out.println("--- Print all SubArray ---");
        System.out.println();
        for (int i = 0 ; i<arr.size(); i++){
            System.out.print("\t "+arr.get(i));
        }
    }
}
