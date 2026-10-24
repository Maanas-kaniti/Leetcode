class Solution {
    public int recurse(int[] prices , int i , int hold,int[][] memo){
        if(i>=prices.length) return 0;
        if(memo[i][hold]!=Integer.MIN_VALUE) return memo[i][hold];
        if(hold==1){
            int sell = prices[i]+recurse(prices,i+1,0,memo);
            int notsell = recurse(prices,i+1,1,memo);
            memo[i][hold] = Math.max(sell,notsell);
            return memo[i][hold];
        }
        int pick = recurse(prices,i+1,1,memo)-prices[i];
        int notpick = recurse(prices,i+1,0,memo); 
        memo[i][hold] = Math.max(pick,notpick);
        return memo[i][hold];
    }
    public int maxProfit(int[] prices) {
        int[][] memo = new int[prices.length][2];
        for(int[] row : memo){
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        return recurse(prices,0,0,memo);
    }
}