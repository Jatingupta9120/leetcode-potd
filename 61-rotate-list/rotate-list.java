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
    public ListNode rotateRight(ListNode head, int k) {
        //find len
        if (head == null || head.next == null || k == 0) return head;
    
        ListNode temp=head;
        int len_node=0;
        while(temp!=null){
            temp=temp.next;
            len_node++;
        }
        //make it circular and store front values after this and break after this and connect with front head
        k = k % len_node;
        if(k == 0 ) {
            return head;
        }
        int stepsToNewTail = len_node - k;
        ListNode newTail = head;
        for(int i=1;i<stepsToNewTail;i++){
            newTail=newTail.next;
        }

        ListNode newHead=newTail.next;
        newTail.next=null;

        ListNode prevNode = new ListNode(-1);
        temp = newHead;
        while(temp != null) {
            prevNode = temp;
            temp= temp.next;
        }
        prevNode.next = head;
        return newHead;
       
    }
}