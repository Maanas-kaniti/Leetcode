class Solution {
    public int dp(int[] prices , int i , int hold , int[][] memo , int fee){
        if(i>=prices.length) return 0;
        if(memo[i][hold]!=Integer.MIN_VALUE) return memo[i][hold];
        if(hold==1){
            int sell = prices[i]+dp(prices,i+1,0,memo,fee)-fee;
            int notsell = dp(prices,i+1,1,memo,fee);
            memo[i][hold] = Math.max(sell,notsell);
            return memo[i][hold];
        }
        int pick = dp(prices,i+1,1,memo,fee)-prices[i];
        int notpick = dp(prices,i+1,0,memo,fee);
        memo[i][hold] = Math.max(pick,notpick);
        return memo[i][hold];
    }
    public int maxProfit(int[] prices, int fee) {
        int[][] memo = new int[prices.length][2];
        for(int[] row : memo){
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        return dp(prices,0,0,memo,fee);
    }
}