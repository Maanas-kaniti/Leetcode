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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return head; 
        }
        if(head.next==null) return head.next;
        int len = 1;
        ListNode temp = head;
        while(temp.next!=null){
            len++;
            temp = temp.next;
        }
        System.out.println(len);
        ListNode slow = head;
        ListNode fast = head.next;
        int n = 0;
        while(fast!=null){
            n++;
            if(n==len/2){
                slow.next = fast.next;
            }
            slow = fast;
            fast = fast.next;
        }
        return head;
    }
}