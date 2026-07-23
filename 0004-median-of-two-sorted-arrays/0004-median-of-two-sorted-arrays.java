class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        System.out.println(len);
        int median = 0;
        int median1 = -1;
        if(len %2==1) median = len/2 +1 ;
        else{
            median = len/2;
            median1 = len/2+1;
        }
        int count = 0;
        int i = 0;
        int j= 0;
        double ans = 0;
        System.out.println(median + " "+median1);
        while(i<nums1.length || j<nums2.length){
            if(i<nums1.length && j<nums2.length){
                if(nums1[i]<=nums2[j]){
                    count++;
                    if(count==median) ans+=nums1[i];
                    if(median1!=-1 && count==median1) ans+=nums1[i];
                    i++;
                }
                else if(nums1[i]>=nums2[j]){
                    count++;
                    if(count==median) ans+=nums2[j];
                    if(median1!=-1 && count == median1) ans+=nums2[j];
                    j++;
                }
            }
            else if(i<nums1.length){
                count++;
                if(count==median) ans+=nums1[i];
                if(median1!=-1 && count == median1) ans+=nums1[i];
                i++;
            }
            else{
                count++;
                if(count==median) ans+=nums2[j];
                if(median1!=-1 && count == median1) ans+=nums2[j];
                j++;
            }
        }
        System.out.println(ans);
        if(len%2==0){
            return ans/2;
        }
        return ans;
    }
}