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
    
    boolean treeIsBalanced = true;
    
    public boolean isBalanced(TreeNode root) {
        
        findHeight(root);
        
        return treeIsBalanced;
    }
    
    // difference between depth and height is just 1
    public int findHeight(TreeNode root) {
        if (root==null) {
            return 0;
        }
        int leftH = findHeight(root.left);
        int rightH = findHeight(root.right);
        
        if (Math.abs(leftH-rightH)>1) treeIsBalanced = false;
        
        return 1 + Math.max(leftH, rightH);
    }
}
