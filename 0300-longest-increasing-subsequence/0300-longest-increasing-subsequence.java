class Solution {
    static int dp(int[] nums , int i , int pi , int[][] memo){
        if(i==nums.length) return 0;
        if(memo[i][pi+1]!=-1) return memo[i][pi+1];
        int pick = 0;
        if(pi==-1 || nums[i]>nums[pi]){
            pick = 1+ dp(nums,i+1,i,memo);
        }
        int notpick = dp(nums,i+1,pi,memo);
        return memo[i][pi+1] = Math.max(pick,notpick);
    }
    public int lengthOfLIS(int[] nums) {
        int[][] memo = new int[nums.length+1][nums.length+1];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        return dp(nums,0,-1,memo);
    }
}