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
        ListNode curr = head;
        ListNode res = null;
        while(curr.next!=null){
            map.put(curr,map.getOrDefault(curr,0)+1);
            if(map.get(curr)>1){
                res = curr;
                break;
            }
            curr = curr.next;
        }
        return res;
    }
}