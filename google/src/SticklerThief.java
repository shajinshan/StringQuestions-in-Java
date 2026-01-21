public class SticklerThief {
    public static void main(String[] args) {
int[] arr = {9 ,4 ,11, 12, 6 ,12};
        System.out.println(findMaxSum(arr));
    }
    public static int findMaxSum(int[] arr) {
        // code here
        int n = arr.length;
        int []dp = new int[n+1];

        for(int i = 0;i<=n;i++)
            dp[i] = -1;

        return max(arr,arr.length-1,dp);
    }
    public static  int max(int []arr,int n, int[]dp){

        if (n == 0) return arr[0];
        if (n < 0) return 0;

        if(dp[n] != -1)
            return dp[n];

        int include = arr[n] + max(arr, n - 2,dp);
        int exclude = max(arr, n - 1,dp);

        dp[n] = Math.max(include,exclude);

        return dp[n];
    }
}
