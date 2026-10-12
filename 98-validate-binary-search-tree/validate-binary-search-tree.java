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
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        Integer prev = null; // Tracks the last processed value

        while (curr != null || !stack.isEmpty()) {
            // 1. Dive as far left as possible
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // 2. Process the top node
            curr = stack.pop();

            // In-order values must be strictly increasing
            if (prev != null && curr.val <= prev) {
                return false;
            }
            prev = curr.val;

            // 3. Step right and repeat the cycle
            curr = curr.right;
        }

        return true;
    }
}