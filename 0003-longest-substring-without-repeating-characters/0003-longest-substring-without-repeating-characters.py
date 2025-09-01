class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i = 0
        j = 0
        m = 0
        l = 0
        myset = []
        while i<len(s):
            if j<len(s) and (s[j] not in myset):
                myset.append(s[j])
                j+=1
                l+=1
                m = max(m,l)
            else:
                myset = []
                i+=1
                j = i
                l = 0
        return m
        
