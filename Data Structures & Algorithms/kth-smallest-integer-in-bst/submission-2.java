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
    int count=0,result=0;
    private void sksmall(TreeNode root, int k){
        if(root==null) return;
        sksmall(root.left,k);
        count++;
        if(count==k){
        result=root.val;
        return;
        }
     sksmall(root.right,k);  
    }
    public int kthSmallest(TreeNode root, int k) {
        sksmall(root,k);
        return result;

        
    }
}
