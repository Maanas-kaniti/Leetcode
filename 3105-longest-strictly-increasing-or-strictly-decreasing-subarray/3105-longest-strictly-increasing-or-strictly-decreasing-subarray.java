class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int max_dec = 1;
        int max_inc = 1;
        for(int i = 1;i<nums.length;i++){

            if(nums[i]>nums[i-1]){
                dec = 1;
                inc++;
                max_inc = Math.max(inc,max_inc);
            }
            else if(nums[i]<nums[i-1]){
                inc = 1;
                dec++;
                max_dec = Math.max(dec,max_dec);
            }
            else {
                inc = 1;
                dec = 1;
            }
            
        }
      
        return Math.max(max_dec,max_inc);
    }
}