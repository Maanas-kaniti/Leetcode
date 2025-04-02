class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        l = s.split(" ")
        res = []
        for i in l:
            if i == '':
                continue
            else:
                res.append(i)
        return len(res[-1])
