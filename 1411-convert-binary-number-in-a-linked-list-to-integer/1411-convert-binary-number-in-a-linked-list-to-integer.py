# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        if not head:
            return
        curr = head
        l = 0
        while curr:
            l+=1
            curr = curr.next
        print(l)
        l = l-1
        c = 0
        curr = head
        while curr:
            if curr.val == 1:
                c+= 1*pow(2,l)
                l-=1
            else:
                c+=0*pow(2,l)
                l-=1
            print(l)
            curr = curr.next
        return c
