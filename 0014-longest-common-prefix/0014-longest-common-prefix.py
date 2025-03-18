class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs)<2:
            return strs[0]
        strs.sort()
        cp=""
        i=0
        while i< len(strs[0]) and i<len(strs[-1]):
            if strs[0][i]==strs[-1][i]:
                cp+=strs[0][i]
                i+=1
            else:
                break
        return cp