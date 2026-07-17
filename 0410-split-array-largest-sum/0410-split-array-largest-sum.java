class Solution {
    public int splitArray(int[] nums, int k) {
        int l = nums[0];
        int r = 0;
        for(int n: nums){
            l = Math.max(l,n);
            r+=n;
        }
        int ans = 0;
        while(l<=r){
            int mid = l + (r-l)/2;
            int m = 1;
            int count = 0;
            for(int i = 0;i<nums.length;i++){
                if(count+nums[i]<=mid){
                    count+=nums[i];
                }
                else{
                    m++;
                    count = nums[i];
                }
            }
            if(m<=k){
                ans = mid;
                r = mid-1;
            }
            else l = mid+1;
        }

        return ans;
    }
}