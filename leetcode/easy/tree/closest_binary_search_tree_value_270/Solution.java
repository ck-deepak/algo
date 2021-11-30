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
    int guess = Integer.MIN_VALUE;
    
    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return 0;
        }
        
        closestValue(root.left, target);
        guess = compareValue(target, root.val, guess);
        closestValue(root.right, target);
        return guess;
    }
    
    public int compareValue(double target, int cur, int guess) {
        double existingDiff = Math.abs(target - guess);
        double curDiff = Math.abs(target - cur);
        return (curDiff < existingDiff) ? cur : guess;
    }
}
