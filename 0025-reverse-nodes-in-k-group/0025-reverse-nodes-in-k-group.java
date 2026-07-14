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
    private ListNode reversell(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
        ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    private ListNode findkthnode(ListNode temp,int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode nextnode;
        ListNode prevlast=null;
        while(temp!=null){
        ListNode kthnode=findkthnode(temp,k);
        if(kthnode==null){
            if(prevlast!=null){
                prevlast.next=temp;
            }
            break;
        }
        nextnode=kthnode.next;
        kthnode.next=null;
        reversell(temp);
        if(temp==head){
            head=kthnode;
        }
        else prevlast.next=kthnode;
            prevlast=temp;
            temp=nextnode;
        }
        return head;
    }
}