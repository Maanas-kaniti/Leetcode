# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return 
        if not head.next:
            return 
        c = 0 
        nod = head

        while nod:
            c+=1
            nod = nod.next
        print(c)
        prev = head
        curr = head.next
        m = 0
        mid = c//2
        while curr:
            m+=1
            if m==mid:
                prev.next = curr.next
            prev = curr
            curr = curr.next
        return head

