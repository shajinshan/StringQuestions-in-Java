public class StockBuyAndsell {
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(stockBuySell(arr));
    }

    static int stockBuySell(int arr[]) {
        // code here
        int maxProfit=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
                maxProfit+=(arr[i+1]-arr[i]);
        }
        return maxProfit;
    }
}
