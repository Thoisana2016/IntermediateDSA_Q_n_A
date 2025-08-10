public class _16_Special_Susequence_AG {

    public static int specialSubsequence(String str){

        char[] ch = str.toCharArray();
//        for (int i = 0; i < str.length();i++){
//            System.out.println(" "+ch[i]);
//        }
        int a = 0, g = 0;
        for (int i = str.length()-1; i >= 0; i--){
            if(ch[i] == 'G'){
                g++;
            }
            else if(ch[i] == 'A') {
                a += g;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String str = "ABCGAG";
        int ans = specialSubsequence(str);
        System.out.println("--- SPECIAL SUBSEQUENCE ---");
        System.out.println("The special subsequence count : "+ans);
        return;
    }
}
