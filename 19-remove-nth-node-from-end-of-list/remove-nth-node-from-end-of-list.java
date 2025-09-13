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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode>st=new Stack();
        if(head==null||head.next==null)return null;

        ListNode dummy=new ListNode(0,head);
        ListNode curr=dummy;
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
        }

        for(int i=0;i<n;i++){
            st.pop();
        }

        ListNode deleteNode=st.peek();
        deleteNode.next=deleteNode.next.next;
        return dummy.next;
    }
}