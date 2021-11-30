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
    // whenever a result needs to be recorded, a global variable is necessary
    TreeNode result = null;
    
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }
        
        searchBST(root.left, val);
        if (root.val == val) {
            result= root;
        }
        searchBST(root.right, val);
        
        return result;
    }
}
