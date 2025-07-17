class Solution:
    def minimumSubarrayLength(self, nums: List[int], k: int) -> int:
        n = len(nums)
        m = float("inf")
        i = 0
        j = 0
        while i<n:
            if j<n:
                sub = nums[i:j+1]
                if len(sub)==1:
                    if sub[0] >=k:
                        m = min(m,len(sub))
                else:
                    r = 0
                    for v in range(len(sub)):
                        r = r | sub[v]
                    print(r)
                    if r>=k:
                        m = min(m,len(sub))
                j+=1
            else:
                i+=1
                j=i
            print(m)
        if m!=float("inf"):
            return m
        else:
            return -1