# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return 
        c = 0
        curr = head
        while curr:
            c+=1
            curr = curr.next
        curr = head
        m = 0
        while curr:
            m +=1
            if m==(c//2)+1:
                head = curr
                break
            curr = curr.next
        return head
            