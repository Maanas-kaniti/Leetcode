class Solution {
     public int recurse(int[] prices , int i , int hold, int k ,int[][][] memo){
        if(i>=prices.length || k==0) return 0;
        if(memo[i][hold][k]!=Integer.MIN_VALUE) return memo[i][hold][k];
        if(hold==1){
            int sell = prices[i]+recurse(prices,i+1,0,k-1,memo);
            int notsell = recurse(prices,i+1,1,k,memo);
            memo[i][hold][k] = Math.max(sell,notsell);
            return memo[i][hold][k];
        }
        int pick = recurse(prices,i+1,1,k,memo)-prices[i];
        int notpick = recurse(prices,i+1,0,k,memo);
        memo[i][hold][k] = Math.max(pick,notpick);
        return memo[i][hold][k];
    }
    public int maxProfit(int k, int[] prices) {
        int[][][] memo = new int[prices.length][2][k+1];
        for(int[][] row : memo){
            for(int[] r : row){
                Arrays.fill(r,Integer.MIN_VALUE);
            }
        }
        return recurse(prices,0,0,k,memo);
    }
}