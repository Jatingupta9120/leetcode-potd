/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //Its quite challening when we dont have a head but we have learned and understand the problem so we can do it 
        // 1->2->3
        node.val=node.next.val;
        node.next=node.next.next;
    }
}