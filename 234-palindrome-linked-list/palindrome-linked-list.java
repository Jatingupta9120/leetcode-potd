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
    public ListNode reverseLL(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        //calculate mid
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        if(fast!=null){
            fast=fast.next;
        }

        slow=reverseLL(slow);
        fast=head;

        //st comparing one by one
        while(slow!=null){
            if(slow.val!=fast.val)return false;

            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}