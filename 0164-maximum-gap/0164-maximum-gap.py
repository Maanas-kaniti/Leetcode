class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        nums = sorted(nums)
        m = 0
        if len(nums)<2:
            return 0
        else:
            for i in range(len(nums)-1):
                d = nums[i+1]-nums[i]
                if d>m:
                    m = d
        return m