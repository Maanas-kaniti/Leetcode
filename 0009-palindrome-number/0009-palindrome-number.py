class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev=0
        if x<0:
            return False
        t=x
        while t!=0:
            dig=t%10
            rev=rev*10+dig
            t//=10
        return (rev==x)
            