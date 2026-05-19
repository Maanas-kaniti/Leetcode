import java.util.*;
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int m = -1;
        int i = 0;
        int j = 0;
        while(i<nums1.length){
            if(j<nums2.length && nums1[i]==nums2[j]){
                m=nums1[i];
                break;
            }
            else if(j<nums2.length && nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        
        return m;
    }
}