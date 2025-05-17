class MinStack:

    def __init__(self):
        self.mainstack=[]

    def push(self, val: int) -> None:
        self.mainstack.append(val)
    def pop(self) -> None:
        self.mainstack.pop()

    def top(self) -> int:
        return self.mainstack[-1]
        

    def getMin(self) -> int:
        tem=sorted(self.mainstack)
        return tem[0]

# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()