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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
       ListNode curr = head;
       ListNode temp = head;
       while(curr.next!=null){
        ListNode prev = curr.next;
        curr.next = prev.next;
        prev.next = temp;
        temp = prev;
       }
       return temp;
    }
}