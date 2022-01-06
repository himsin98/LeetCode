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
    public boolean findTarget(TreeNode root, int k) {
        var set = new HashSet<Integer>();
        var q = new LinkedList<TreeNode>();
        q.add(root);
        while(! q.isEmpty()){
            var node = q.poll();
            if(node == null)
                continue;
            if(set.contains(k-node.val))
                return true;
            set.add(node.val);
            q.add(node.left);
            q.add(node.right);
        }
        return false;
    }
}