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
   SC: O(N) 
 */
class Solution {
    TreeNode cur;
    
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> arr = new ArrayList();
        inOrder(root, arr);
        // you need cur node to progress each node from root node
        //  
        TreeNode ans = new TreeNode(0), cur = ans;
        for (int v: arr) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }
    
    public void inOrder(TreeNode node, List<Integer> arr) {
        if (node == null) return;
        // left
        inOrder(node.left, arr);
        
        // node you want, root
        arr.add(node.val);
        
        inOrder(node.right, arr);
    }
}
