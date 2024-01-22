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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        Stack<TreeNode>sum=new Stack<>();
        Stack<Integer>sumpath=new Stack<>();
        sum.push(root);
        sumpath.push(root.val);
        while(!sum.isEmpty()){
            TreeNode temp=sum.pop();
            int tempval=sumpath.pop();
            if(temp.left==null&&temp.right==null&&tempval==targetSum){
                return true;
            }
            if(temp.right!=null){
                sum.push(temp.right);
                sumpath.push(temp.right.val+tempval);
            }
            if(temp.left!=null){
                sum.push(temp.left);
                sumpath.push(temp.left.val+tempval);
            }
            
        }
        return false;
        
        
        
    }
}