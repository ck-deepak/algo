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
    
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        // enqueue root 1st
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            // prepare the list for a new level
            result.add(new ArrayList<>());
            
            // number of elements in the current level
            int len = q.size();
            
            // key pattern to recognize is that len of the q will be = num of elements in level
            for (int i=0; i<len; i++) {
                TreeNode node = q.poll();
                
                // adding every node in level
                result.get(level).add(node.val);
                
                // add child nodes of the current level
                // in the queue for the next level
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            level++;
        }
        return result;
    }
}
