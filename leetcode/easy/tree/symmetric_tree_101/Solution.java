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

 TC: O(N)
 SC: O(N) recursive stack trace
 
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null) return true;
        
        return checkSymmetry(root.left, root.right);
    }
    
    private boolean checkSymmetry(TreeNode nodeL, TreeNode nodeR) {
        
        if (nodeL==null && nodeR==null) return true;
        
        if (nodeL==null||nodeR==null) return false;
        
        if (nodeL.val != nodeR.val) return false;
        // we do L.left and R.right and L.right and R.left as thats what symmetry means, we need to check like a mirror image
        return checkSymmetry(nodeL.left, nodeR.right) && checkSymmetry(nodeL.right, nodeR.left);
    }
}
