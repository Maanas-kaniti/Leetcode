class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = l+(r-l)/2;
            System.out.println(l+" "+mid+" "+r);
            if(nums[mid]<=nums[r]){
                ans = Math.min(ans,nums[mid]);
                r = mid-1;
            }
            else l = mid+1;
        }
          return ans;
    }
  
}