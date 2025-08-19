public class _20_Amazing_SubArray {

    public static int amazingSubArray(String str){
        char[] ch = str.toCharArray();
        int mod = 1000000009;
        int count = 0;
        int n = str.length();
        for(int i = 0; i < n; i++){
            char c = str.charAt(i);
            if (isVowel(c)){
                count = (count + (n-i)) % mod;
            }
        }
        return count;
    }
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "ABEC";
        System.out.println("--- AMAZING STRING COUNT ---");
        int ans = amazingSubArray(str);
        System.out.println("The number of amazing string : "+ans);
    }
}
