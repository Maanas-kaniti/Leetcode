class Solution {
    public int searchInsert(int[] nums, int target) {
        int x = -1;
        int l = 0;
      
        int r = nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target){
                    return mid;
                }
                x = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
        if(x==-1){
            return nums.length;
        }
        else return x;
    }
}