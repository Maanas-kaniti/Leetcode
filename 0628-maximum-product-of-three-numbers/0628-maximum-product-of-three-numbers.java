import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int minp = nums[0] * nums[1] * nums[nums.length-1];
        int maxp = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        return Math.max(minp,maxp);
    }
}