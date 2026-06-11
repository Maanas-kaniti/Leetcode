class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            // System.out.println(l + " "+ mid + " "+ r);
            if(mid == r && mid==l){
                return nums[mid];
            }
            if(mid%2==1){
                if(nums[mid]==nums[mid-1]){
                    l = mid+1;
                }
                else r = mid;
            }
            if(mid%2==0){
                if(nums[mid]!=nums[mid+1]){
                    r = mid;
                }
                else l = mid+1;
            }
        }
        return nums[l];
    }
}