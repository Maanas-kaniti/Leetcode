/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        if(head.next==null && n==1) return null;
        int len = 1;
        ListNode curr = head;
        while(curr.next!=null){
            len++;
            curr = curr.next;
        }
        ListNode slow = head ;
        ListNode fast = head;
        int c = 1;
        while(fast.next!=null){
            if(len-n==0) break;
            len--;
            slow = fast;
            fast = fast.next;
            
        }
        if(fast==head){
            fast = fast.next;
            return fast;
        }
        slow.next = fast.next;
        System.out.println(fast.val);
        return head;
    }
}