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
    int digit[];
    int ans=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        digit=new int[10];
        dfs(root);
        return ans;
        
    }
    void dfs(TreeNode root){
        if(root==null)return;
        digit[root.val]++;
        if(root.left==null&&root.right==null){
            if(ispalindrome()){
                ans++;
            }
        }else{
            dfs(root.left);
            dfs(root.right);
            
        }
        digit[root.val]--;
    }
    boolean ispalindrome(){
        int odd=0;
        for(int i=1;i<=9;i++){
            if(digit[i]%2!=0){
                odd++;
            }
        }
        if(odd>1)return false;
        return true;
    }
}