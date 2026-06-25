class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int freq = 0;
       
       
        freq = 0;
        int res = 0;
        for(int i = 0; i<nums.length;i++){
            freq = 0;
            for(int j = i;j<nums.length;j++){
                if(nums[j]==target) freq++;
                if(freq>(j-i+1)/2) res++;
            }
        }
        return res;
    }
}