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
import java.util.*;
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode slow = head;
        ListNode fast = head;
        ListNode res = null;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                cycle = true;
                break;
            }
        }
        
       if(cycle) return slow;
       return null;
    }
}