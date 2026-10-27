class Solution {
    
    static int dp(int[] nums, int t, int i, int sum, int[][] memo, int offset) {

        if (i == nums.length) {
            return sum == t ? 1 : 0;
        }

        int index = sum + offset;

        if (memo[i][index] != Integer.MIN_VALUE) {
            return memo[i][index];
        }

        int pick = dp(nums, t, i + 1, sum - nums[i], memo, offset);
        int notpick = dp(nums, t, i + 1, sum + nums[i], memo, offset);

        return memo[i][index] = pick + notpick;
    }

    public int findTargetSumWays(int[] nums, int target) {
 int total = 0;
        for (int num : nums) {
            total += num;
        }

        if (Math.abs(target) > total) {
            return 0;
        }

        int offset = total;
        int[][] memo = new int[nums.length][2 * total + 1];

        for (int[] row : memo) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        return dp(nums, target, 0, 0, memo, offset);
    }
}