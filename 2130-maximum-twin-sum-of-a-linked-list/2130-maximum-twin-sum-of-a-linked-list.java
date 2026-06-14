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
    public int pairSum(ListNode head) {
        if(head.next == null) return head.val;
        ListNode l = head;
        ListNode r = head;
        int n = 1;
        Stack<Integer> s  = new Stack<>();
        while(r.next!=null){
            r = r.next;
            n++;
        }
        int c = 1;
        while(c<=n/2){
            
            s.push(l.val);
            l = l.next;
            c++;
        } 
        System.out.println(s.toString());
        int m = s.peek();
        while(l!=null){
            m = Math.max(m,s.pop()+l.val);
            l= l.next;
        }
        return m;
    }
}