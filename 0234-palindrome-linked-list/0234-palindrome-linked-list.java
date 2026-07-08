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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondhalf=reverse(slow.next);
        ListNode p1=head;
        ListNode p2=secondhalf;
        while(p2!=null){
            if(p1.val!=p2.val){
                reverse(secondhalf);
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        reverse(secondhalf);
        return true;
    }
    private ListNode reverse(ListNode head){
    if(head==null || head.next==null) return head;
    ListNode newHead=reverse(head.next);
    head.next.next=head;
    head.next=null;
    return newHead;
    }
}