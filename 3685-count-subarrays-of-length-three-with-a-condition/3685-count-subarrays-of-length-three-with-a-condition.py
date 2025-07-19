class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        i=j=0
        n = len(nums)
        c = 0
        while i<n:
            if j<n:
                sub = nums[i:j+1]
                if len(sub)==3:
                    if sub[0]+sub[-1] == sub[1]/2:
                        c+=1
                j+=1
            else:
                i+=1
                j=i
        return c