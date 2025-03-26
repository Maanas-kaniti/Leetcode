class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        i = -1
        x = 0 
        while(x<len(nums)):
            if nums[x]<target:
                i=x
            elif nums[x] == target:
                i=x
                return i
            else:
                return i+1
            x+=1
        return i + 1
           
