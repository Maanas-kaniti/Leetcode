class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = nums[0];
        for(int n : nums){
            if(n>r) r = n;
        }
        int ans = 0;
        while(l<=r){
            long sum = 0;
            int mid = l+(r-l)/2;
            System.out.println(l + " "+ mid + " " + r );
            for(int n : nums){
                sum+=(n+mid-1)/mid;
                
            }
            System.out.println(sum);
            if(sum<=threshold){
                ans = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
}