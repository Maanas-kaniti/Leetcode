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
 import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        stack.push(curr.val);
        curr = curr.next;
        while(curr!=null){
            if(stack.peek() == curr.val){
                stack.pop();
            }
            else{
                stack.push(curr.val);
            }
            curr = curr.next;
        }
        return stack.isEmpty();
    }
}