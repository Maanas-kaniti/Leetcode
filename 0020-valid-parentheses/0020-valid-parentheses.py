class Solution:
    def isValid(self, s: str) -> bool:
        mapping = {'(':')','[':']','{':'}'}
        stack = [] 
        if len(s)==1:
            return False
        else:
            for i in s:
                if i in mapping:
                    stack.append(i)
                elif stack and i == mapping[stack[-1]]:
                    stack.pop()
                else:
                    return False
            return not stack      