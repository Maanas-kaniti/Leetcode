class Solution:
    def longestPalindrome(self, s: str) -> str:
        k=1
        res=" "
        n=len(s)
        if n==1:
            return s
        for i in range(n):
            for j in range(n-k+1):
                sub=s[j:j+k]
                rev=sub[::-1]
                if sub==rev:
                    res=sub
            k=k+1
        return res
