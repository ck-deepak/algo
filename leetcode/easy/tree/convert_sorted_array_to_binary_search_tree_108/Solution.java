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
    public TreeNode sortedArrayToBST(int[] nums) {
        
       return populateSubTree(nums, 0, nums.length-1); 
    }
    
    public TreeNode populateSubTree(int[] nums, int start, int end) {
        
        if (start>end) {
            return null;
        }
        
        int mid = (start + end)/2;
        // root node will always be the middle node
        TreeNode root = new TreeNode (nums[mid]);
        
        root.left = populateSubTree(nums, start, mid-1);
        root.right = populateSubTree(nums, mid+1, end);
        return root;
    }
        
}
