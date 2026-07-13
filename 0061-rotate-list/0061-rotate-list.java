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
    private ListNode findNnode(ListNode temp,int k){
        int count=1;
        while(temp.next!=null){
            if(count==k) return temp;
            count++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
            len++;temp=temp.next;
        }
        if(k%len==0) return head;
        k%=len;
        temp.next=head;
        ListNode newlastnode=findNnode(head,len-k);
        head=newlastnode.next;
        newlastnode.next=null;
        return head;
    }
}