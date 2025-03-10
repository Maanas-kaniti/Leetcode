class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        mer=nums1+nums2
        s=sorted(mer)
        n=len(s)
        if len(s)%2==0:
            flag=True
        else:
            flag=False
        if flag is True:
            return (s[int((n/2)-1)]+s[int((n/2))])/2
        else:
            return s[int(n/2)]

