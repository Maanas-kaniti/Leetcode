from collections import Counter
class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        count = Counter(nums)
        l = []
        for i in count:
            if count[i]>len(nums)/3:
                l.append(i)
        return sorted(l)