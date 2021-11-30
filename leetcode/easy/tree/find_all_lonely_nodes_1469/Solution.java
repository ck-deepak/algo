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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }
    
    public void inOrder(TreeNode root, List<Integer> arr) {
        if (root==null){
            return;
        }
        
        // lonely right
        if (root.left==null && root.right!=null) {
            arr.add(root.right.val);
        }
        
        // lonely left
        if (root.right==null && root.left!=null) {
            arr.add(root.left.val);
        }
        
        inOrder(root.left, arr);
        inOrder(root.right, arr);
    }
}
