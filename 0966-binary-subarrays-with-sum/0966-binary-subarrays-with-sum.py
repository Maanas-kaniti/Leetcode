class Solution:
    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
        c=w=0
        d = {0:1}
        for i in range(len(nums)):
            w+=nums[i]
            if w-goal in d:
                c+=d[w-goal]
            d[w] = d.get(w,0)+1
        return c
