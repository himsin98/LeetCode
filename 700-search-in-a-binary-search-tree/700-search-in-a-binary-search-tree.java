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
    public TreeNode searchBST(TreeNode root, int val) {
         Queue<TreeNode> q1 = new LinkedList<>();
        TreeNode temp = null;
        q1.add(root);
        while(!q1.isEmpty()){
            TreeNode temp1 = q1.remove();
            if(temp1.val==val){
                return temp1;
            }
            if(temp1.left!=null){
                q1.add(temp1.left);
            }
            if(temp1.right!=null){
                q1.add(temp1.right);
            }
            
        }
        return temp;
    }
}