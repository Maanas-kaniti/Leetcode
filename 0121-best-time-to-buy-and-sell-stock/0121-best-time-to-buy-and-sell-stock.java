class Solution {
    static int recurse(int[] arr , int i,int min){
        if(i==arr.length) return 0;
        min = Math.min(min,arr[i]);
        int profit = arr[i]-min;
        return Math.max(profit,recurse(arr,i+1,min));
    }
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        return recurse(prices,0,prices[0]);
    }
}