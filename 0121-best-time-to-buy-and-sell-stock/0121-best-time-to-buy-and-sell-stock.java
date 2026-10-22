class Solution {
    static int recurse(int[] arr , int i,int min,int[] dp){
        if(i==arr.length) return 0;
        if(dp[i]!=Integer.MIN_VALUE) return dp[i];
        min = Math.min(min,arr[i]);
        int profit = arr[i]-min;
        dp[i] = Math.max(profit,recurse(arr,i+1,min,dp));
        return dp[i];
    }
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        return recurse(prices,0,prices[0],dp);
    }
}