class Solution {
    static int dp(int[] nums, int t, int i, int sum) {
        if (i == nums.length) {
            return sum == t ? 1 : 0;
        }
        int pick = 0, notpick = 0;
        pick += dp(nums, t, i + 1, sum - nums[i]);
        notpick += dp(nums, t, i + 1, sum + nums[i]);
        return notpick + pick;
    }

    public int findTargetSumWays(int[] nums, int target) {
        return dp(nums, target, 0, 0);
    }
}