class Solution:
    def longestAlternatingSubarray(self, nums: List[int], threshold: int) -> int:
        i = 0
        j = 0
        res = []
        while i<len(nums):
            if j<len(nums) and nums[i]%2==0:
                s = nums[i:j+1]
                if max(s)<=threshold:
                    flag = True
                    for v in range(len(s)-1):
                        if s[v]%2==s[v+1]%2:
                            flag = False
                    if flag:
                        if len(s)>len(res):
                            res = s
                            print(res)
                j+=1
            else:
                i+=1
                j = i
        return len(res)
        