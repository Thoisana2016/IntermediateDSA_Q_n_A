import java.io.FileOutputStream;

public class _19_Best_Time_to_Buy_and_Sell_Stock {


    public static int buySellStock(int[] arr){
        if (arr.length < 2)
            return 0;
        int profit = 0;
        int min = arr[0];
        for(int i = 1;i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
            if (arr[i]-min > profit){
                profit = arr[i]-min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 4};
        int ans = buySellStock(arr);
        System.out.println("--- BUY AND SELL STOKE ---");
        System.out.println("Profit amount is : "+ans);
    }
}
