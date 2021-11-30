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
 
 
 * Main pattern to know here is that the closest neighbors to the root in question will be the rightmost leaf of the left child and left most leaf of right child, then you have to find min between them.
 */
class Solution {
    
    public int minDiffInBST(TreeNode root) {
        if (root==null) {
            return Integer.MAX_VALUE;
        }
        
        int diff1 = root.left==null? Integer.MAX_VALUE : Math.abs(root.val - dfsToRightMostNode(root.left));
        int diff2 = root.right==null? Integer.MAX_VALUE : Math.abs(root.val - dfsToLeftMostNode(root.right));
        int currDiff = Math.min(diff1, diff2);
        
        return Math.min(currDiff, Math.min(minDiffInBST(root.left), minDiffInBST(root.right)));
    }
    
    public int dfsToRightMostNode(TreeNode node) {
        if (node.right==null) {
            return node.val;
        }
        
        return dfsToRightMostNode(node.right);
    }
    
    public int dfsToLeftMostNode(TreeNode node) {
        if (node.left==null) {
            return node.val;
        }
        
        return dfsToLeftMostNode(node.left);
    }
}
