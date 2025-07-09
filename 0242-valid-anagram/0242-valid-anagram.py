class Solution:
    def isAnagram(self, s1: str, s2: str) -> bool:
        d = {}
        ana = False
        if len(s1)!=len(s2):
            return False
        for i in s1:
            if i in d:
                d[i]+=1
            else:
                d[i] = 1
        ana = True
        for i in s2:
            if i in d:
                d[i]-=1
            else:
                ana = False
        if ana:
            for i in d.values():
                if i !=0:
                    ana = False
                else:
                    ana = True
        return ana