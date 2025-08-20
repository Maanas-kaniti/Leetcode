class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right;
        for(right = 0;right<nums.length;right++){
            if(nums[left]!=nums[right]){
                left++;
                nums[left] = nums[right];
                
            }
        }
        return left+1; 
    }
}