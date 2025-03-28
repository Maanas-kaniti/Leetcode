class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # l = []
        # for i in range(len(strs)):
        #     s = sorted(strs[i])
        #     l1 = []
        #     for j in range(len(strs)):
            
        #         if sorted(strs[j])==s:
        #             l1.append(strs[j])   
        #     if l1 in l:
        #         continue
        #     else:
        #         l.append(l1) 
        # return l
        d = {}
        for w in strs:
            s_w = ''.join(sorted(w))
            if s_w in d:
                d[s_w].append(w)
            else:
                d[s_w] = [w]

        return list(d.values())