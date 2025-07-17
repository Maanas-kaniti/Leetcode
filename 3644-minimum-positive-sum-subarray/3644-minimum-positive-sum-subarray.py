class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        n = len(nums)
        m = float("inf")
        for i in range(l,r+1):
            for j in range(n-i+1):
                sub = nums[j:j+i]
                if sum(sub)>0:
                    m = min(m,sum(sub))
        
        if m!=float("inf"):
            return m
        else:
            return -1