class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left = 0
        right = left + 1
        while right<len(nums):
            if nums[left] == nums[right]:
                nums.pop(right)
            elif nums[left]!=nums[right]:
                left+=1
                right+=1