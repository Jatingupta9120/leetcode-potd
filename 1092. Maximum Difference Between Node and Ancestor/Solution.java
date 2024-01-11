/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public int maxAncestorDiff(TreeNode root) {
        return findMaxDiff(root, root.val, root.val);
    }
    
   public int findMaxDiff(TreeNode root, int minVal, int maxVal) {
        if(root == null) {
            return Math.abs(minVal - maxVal);
    }
        minVal = Math.min(minVal, root.val);
        maxVal = Math.max(maxVal, root.val);
       
       int left = findMaxDiff(root.left, minVal, maxVal);
       int right = findMaxDiff(root.right, minVal, maxVal);
        return Math.max(left, right);
    } 
}