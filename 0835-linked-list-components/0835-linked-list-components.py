# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def numComponents(self, head: Optional[ListNode], nums: List[int]) -> int:
        if not head:
            return  
        curr = head
        c = 0
        while curr:
            if curr.val in nums and ((curr.next is None) or curr.next.val not in nums):
                c+=1
            curr=curr.next
        return c
