class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = nums[0];
        long min = nums[0];
        for(int n : nums){
            if(n>max) max = n;
            if(n<min) min = n;
        } 
        return (max-min)*k;
    }
}