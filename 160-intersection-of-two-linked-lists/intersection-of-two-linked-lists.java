/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getLength(ListNode head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headALen=getLength(headA);
        int headBLen=getLength(headB);

        while(headALen>headBLen){
            headA=headA.next; 
            headALen--;
        }
        while(headBLen>headALen){
            headB=headB.next;
            headBLen--;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}