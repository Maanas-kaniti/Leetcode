class Solution:
    def isPalindrome(self, s: str) -> bool:
        a = s.lower()
        a.replace(" ","")
        print(a)
        r = len(a)-1
        l = len(a)-1
        f = True
        b = ""
        while l >=0 :
            if a[l].isalnum() and a[l]!=" ":
                b+=a[l]
            l-=1
        return b == b[::-1]