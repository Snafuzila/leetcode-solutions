# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        if not root:
            return 0
        def dfs(node, maximum):
            if not node:
                return 0
            if node.val >= maximum:
                return dfs(node.right, max(node.val, maximum)) + dfs(node.left, max(node.val, maximum)) + 1
            return dfs(node.right, max(node.val, maximum)) + dfs(node.left, max(node.val, maximum))
        
        return dfs(root, root.val)

        

        
