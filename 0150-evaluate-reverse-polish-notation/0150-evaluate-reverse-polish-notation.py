class Solution(object):
    def evalRPN(self, tokens):
        stack=[]
        for op in tokens:
            if op=='+':
                a,b=stack.pop(),stack.pop()
                stack.append(b+a)
            elif op=='-':
                a,b=stack.pop(),stack.pop()
                stack.append(b-a)
            elif op=='*':
                a,b=stack.pop(),stack.pop()
                stack.append(b*a)
            elif op=='/':
                a,b=stack.pop(),stack.pop()
                stack.append(int(b/a))
            else:
                stack.append(int(op))
        return stack.pop()
        