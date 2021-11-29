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

 TC: O(T1+T2)
 SC: O(T1+T2)
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (isLeaf(root1) && isLeaf(root2)) {
            return root1.val == root2.val;
        }
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
       

	// in order is L,Root,Right 
	// pre order is Root, Left, Right
	// post order is L,Right,Root
        inOrderTraverseToAddLeaves(root1, arr1);
	// don't have process root node, just childs to find leaves
        inOrderTraverseToAddLeaves(root2, arr2);
        
        if (arr1.size()!=arr2.size()) return false;
        
        for (int i=0; i<arr1.size(); i++) {
            if (arr1.get(i)!=arr2.get(i)) return false;
        }

        return true;
    }
    // important to know this property about leaves of a tree, it needs to be both, if only one is missing, not a leaf yet    
    public boolean isLeaf(TreeNode node) {
        if (node.left==null && node.right==null) return true;
        return false;
    }
    
    public void inOrderTraverseToAddLeaves(TreeNode node, ArrayList<Integer> arr) {
        
        if (node==null) return;
        
        if (isLeaf(node)) {
            arr.add(node.val);
            return;
        }
        
        inOrderTraverseToAddLeaves(node.left, arr);
        inOrderTraverseToAddLeaves(node.right, arr);
    }
}
