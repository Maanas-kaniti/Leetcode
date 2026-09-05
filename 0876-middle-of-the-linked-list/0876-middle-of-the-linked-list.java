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
        int len = 0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            len++;
        }
        ListNode curr1 = head;
        int c = 0;
        int res = (len%2==0)? len/2+1 : len/2;
        while( curr1.next!=null){
            if(c==len/2) break;
            c++;
            curr1 = curr1.next;
        }
        return curr1;
    }
}