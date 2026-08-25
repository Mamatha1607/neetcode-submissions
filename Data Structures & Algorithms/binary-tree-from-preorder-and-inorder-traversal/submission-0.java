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
      int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);

    }
    public TreeNode build(int[]preorder,int[] inorder,int start, int end){
         if (start > end) return null;
       
        int rootval=preorder[idx];
        TreeNode node = new TreeNode(rootval);
        idx++;
    
    int mid=0;
    for(int i=start;i<=end;i++)
    {
    if(inorder[i]==rootval){
     mid=i;
     break;
    }
    }
    
    node.left=build(preorder,inorder,start,mid-1);
    node.right=build(preorder,inorder,mid+1,end);
    return node;
}
}
