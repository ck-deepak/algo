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
        if (root ==null || (root.left==null && root.right==null)) {
            return false;
        }
        
        HashSet<Integer> hashSet = new HashSet<>();
        return inOrder(root, k, hashSet);
    }
    
    public boolean inOrder(TreeNode root, int k, HashSet<Integer> hashSet) {
        if (root==null) {
            return false;
        }
        
        if (hashSet.contains(k-root.val)) {
            return true;
        }
        hashSet.add(root.val);
        return inOrder(root.left,k, hashSet) ||  inOrder(root.right,k, hashSet);
    }
}
