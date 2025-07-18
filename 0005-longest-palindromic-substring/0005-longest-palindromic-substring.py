class Solution:
    def longestPalindrome(self, s: str) -> str:
        i=j=0
        rev = ""
        n = len(s)
        while i<n:
            if j<n:
                sub = s[i:j+1]
                if sub == sub[::-1]:
                    if len(sub)>len(rev):
                        rev = sub
                j+=1
            else:
                i+=1
                j=i
        return rev