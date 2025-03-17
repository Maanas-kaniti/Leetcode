class Solution:
    def romanToInt(self, s: str) -> int:
        d = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        val = 0
        for i in range(1,len(s)):
            if d[s[i-1]]>=d[s[i]]:
                val+=d[s[i-1]]
            elif d[s[i-1]]<d[s[i]]:
                val+=d[s[i]]-d[s[i-1]]-d[s[i]]

        # if d[s[-1]]>d[s[-2]]:
        #     val+=d[s[-1]]-d[s[-2]]-d[s[-1]] 
        # else: 
        #     val+=d[s[-1]]
        return val+d[s[-1]]