class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d = {0:1}
        c=w=0
        for i in range(len(nums)):
            w+=nums[i]
            if w-k in d:
                c+=d[w-k]
            d[w]=d.get(w,0)+1
        print(d)
        return c
            
        