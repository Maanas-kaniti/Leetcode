class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int merged = nums1.length+nums2.length;
        int k = 0;
        if(merged%2==0){
            k=(nums1.length+nums2.length)/2 ;
        }
        else{
            k = (nums1.length+nums2.length)/2 + 1;
        }
        System.out.println(k);
        int l = Math.max(0,k-nums2.length);
        int r = Math.min(k,nums1.length);
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            int part = k-mid;
            int lefta = (mid==0) ? Integer.MIN_VALUE : nums1[mid-1];
            int righta = (mid==nums1.length) ? Integer.MAX_VALUE : nums1[mid];
            int leftb = (part==0) ? Integer.MIN_VALUE : nums2[part-1];
            int rightb = (part==nums2.length) ? Integer.MAX_VALUE : nums2[part];
            if(leftb>righta){
                l = mid+1;
            }
            else if(lefta>rightb){
                r = mid-1;
            }
            else{
                if(merged%2==1){
                    return Math.max(lefta,leftb);
                }
                else{
                    ans +=Math.max(lefta,leftb);
                    ans+=Math.min(righta,rightb);
                    System.out.println(ans);
                    return (double)ans/2;
                }
            }
            
        }
        return -1;
    }
}