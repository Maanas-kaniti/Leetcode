/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode curr = head;
        ListNode curr1 = head;
        curr = curr.next;
        curr1 = curr1.next.next;
        if(curr1==null) return false;
        else if(curr1==curr) return true;

        while(curr1.next!=null){
            if(curr==curr1) return true;
            curr = curr.next;
            if(curr1.next.next!=null){
                curr1 = curr1.next.next;
            }
            else return false;
            
        }
        return false;
    }
}