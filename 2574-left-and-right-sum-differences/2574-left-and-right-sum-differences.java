import java.util.*;
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for(int n:nums){
            sum+=n;
        }
        int[] res = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int j = nums.length-1;
        for(int i = 1;i<nums.length;i++){
            left[i] = left[i-1]+nums[i-1];
            right[i] = right[i-1]+nums[j];
            j--;
        }
        j = right.length-1;
        for(int i = 0;i<nums.length;i++){
            res[i] = Math.abs(left[i]-right[j]);
            j--;
        }
        
        return res;
    }
}