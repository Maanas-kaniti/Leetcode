class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        r=[]
        for i in range(n):
            for j in range(i+1,n):
                if nums[i]+nums[j]==target:
                    r.append(i)
                    r.append(j)
                    return r