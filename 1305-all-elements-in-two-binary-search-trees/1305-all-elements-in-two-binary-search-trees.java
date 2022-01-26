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
    List<Integer> ret  = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        helper(root1,ret);
        helper(root2,ret);
        Collections.sort(ret);
        return ret;
    }
    public void helper(TreeNode root, List<Integer> ret){
        if (root!= null){
            ret.add(root.val);
            helper(root.left,ret);
            helper(root.right,ret);
        }
    }
}