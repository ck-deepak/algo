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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (q.size()!=0) {
            result.add(new ArrayList<>());
            int numElements = q.size();
            Stack<Integer> stack = new Stack<>();
            for (int i=0; i<numElements; i++) {
                TreeNode node = q.poll();
                // if even then add L to R
                if (level%2==0) {
                    result.get(level).add(node.val);
                    // else reverse with stack
                } else {
                    stack.add(node.val);
                }
                
                // add child nodes of the current level
                // in the queue for the next level
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            if (level%2!=0) {
                while(stack.size()!=0) {
                    result.get(level).add(stack.pop());
                }
            }
            level++;
        }
        return result;
    }
}
