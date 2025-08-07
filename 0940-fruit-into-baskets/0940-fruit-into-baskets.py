
class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        d = {}
        n = len(fruits)
        m = 0
        i = 0
        j = 0
        while j<n:
            temp = fruits[j]
            if temp in d:
                d[temp]+=1
            else:
                d[temp]=1
            if len(d)>2:
                d[fruits[i]]-=1
                if d[fruits[i]]==0:
                    del d[fruits[i]]

                i+=1
            m = max(m,j-i+1)
            j+=1
        return m

        