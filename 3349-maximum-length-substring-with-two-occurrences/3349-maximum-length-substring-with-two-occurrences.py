from collections import defaultdict
class Solution:
    def maximumLengthSubstring(self, s: str) -> int:
        i = j = 0
        n = len(s)
        m = float("-inf")
        d = defaultdict(int)
        while j<n:
            d[s[j]]+=1
            while d[s[j]]>2:
                d[s[i]]-=1
                i+=1
            m = max(m,j-i+1)
            j+=1
        return m


            
            


            