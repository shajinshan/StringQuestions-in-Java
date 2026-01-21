public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(arr));
    }

    static int buyAndSellStocks(int[] arr){
        int min = arr[0];//buy
        int cost = 0;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            cost = arr[i] - min;
            profit = Math.max(cost,profit);
            min = Math.min(arr[i],min);
        }
        return profit;

    }
}
