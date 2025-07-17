class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        m = float("-inf")
        w = 0
        i = 0
        j = 0
        avg = 0
        while j<len(nums):
            w +=nums[j]
            if j-i+1==k:
                m = max(m,w)
                w-=nums[i]
                i+=1
            
            j+=1
            
        return m/k