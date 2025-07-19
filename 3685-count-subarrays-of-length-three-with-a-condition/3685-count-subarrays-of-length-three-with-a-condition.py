class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        i=j=0
        n = len(nums)
        c = 0
        k=3
        for i in range(n-k+1):
            sub = nums[i:i+k]
            if len(sub)==3:
                if sub[0]+sub[-1]==sub[1]/2:
                    c+=1
        return c