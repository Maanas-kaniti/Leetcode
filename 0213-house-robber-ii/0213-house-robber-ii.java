class Solution {
    static int dp(int[] nums,int n,int i,int[] memo){
        if(nums.length==1) return nums[0];
        if(i>=n) return 0;
        if(memo[i]!=-1) return memo[i];
        int pick =nums[i] +dp(nums,n,i+2,memo);
        int notpick = dp(nums,n,i+1,memo);
        memo[i] = Math.max(pick,notpick);
        return memo[i];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int memo[] = new int[nums.length];
        Arrays.fill(memo,-1);
        
        int memo1[] = new int[nums.length];
        Arrays.fill(memo1,-1);
        return Math.max(dp(nums,nums.length-1,0,memo),dp(nums,nums.length,1,memo1));
    }
}