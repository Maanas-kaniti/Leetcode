import java.util.*;
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for(int n:nums){
            sum+=n;
        }
        int right = sum, left = 0;
        for(int i = 0;i<nums.length;i++){
            int x = nums[i];
            right-=x;
            nums[i] = Math.abs(left-right);
            left+=x;
        }
        
        return nums;
    }
}