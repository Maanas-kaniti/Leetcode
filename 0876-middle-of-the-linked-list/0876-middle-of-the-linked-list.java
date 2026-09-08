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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode cur = head;
        ListNode curr = head;
        
        while(curr!=null && curr.next!=null){
            System.out.println(cur.val + " "+curr.val);
            cur = cur.next;
            curr = curr.next.next;

        }
        System.out.println(cur.val);
        return cur;
    }
}