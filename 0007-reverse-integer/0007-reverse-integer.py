class Solution:
    def reverse(self, x: int)->int:
        if x<=(2**31)-1 and x>=-2**31:
            if x>0:
                s=0
                while(x!=0):
                    rem=x%10
                    s=(s*10)+rem
                    x=int(x/10)
                if s<=(2**31)-1:
                    return s
                else:
                    return 0
            else:
                x*=-1
                s=0
                while(x!=0):
                    rem=x%10
                    s=(s*10)+rem
                    x=int(x/10)
                if s*-1>=(-2)**31 :
                    return s*-1
                else:
                    return 0
                          
        else:
            return 0


       