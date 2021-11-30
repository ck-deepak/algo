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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        preOrder(root, "", result);
        return result;
    }
    
    public String preOrder(TreeNode root, String ans, List<String> result) {
        if (root==null) {
            return "";
        }
        
        ans = ans + root.val;
        if (root.left!=null || root.right != null) {
            ans = ans + "->";
        } else {
            result.add(ans);
        }
        
        preOrder(root.left, ans, result);
        preOrder(root.right, ans, result);
        
        return ans;
    }
}
