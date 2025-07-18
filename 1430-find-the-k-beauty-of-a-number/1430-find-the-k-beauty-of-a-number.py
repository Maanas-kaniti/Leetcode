class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        c = i = j = 0
        s = str(num)
        n = len(s)
        while i<n:
            if j<n:
                sub = s[i:j+1]
                if len(sub)==k and int(sub)!=0 and ((num % int(sub))==0):
                    c+=1

                j+=1
            else:
                i+=1
                j = i
        return c