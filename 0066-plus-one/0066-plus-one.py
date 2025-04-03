class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        l = []
        res = ""
        for i in range(len(digits)):
            res+=str(digits[i])
        c = str(int(res)+1)
        for i in range(len(c)):
            l.append(int(c[i]))
        return l