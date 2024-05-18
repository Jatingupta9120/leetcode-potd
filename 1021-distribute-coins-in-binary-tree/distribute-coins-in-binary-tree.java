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
    public int ans;
    public int count(TreeNode root){
        if(root==null)return 0;
        int left=count(root.left);
        int right=count(root.right);
        
        ans+=Math.abs(left)+Math.abs(right);
        return left+right+(root.val-1);
    }
    public int distributeCoins(TreeNode root) {
        ans=0;
        count(root);
        return ans;
    }
}