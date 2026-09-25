# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def longestZigZag(self, root: TreeNode | None) -> int:
        self.max_length = 0
        
        def countZigZag(node, direction, length):
            if not node:
                return
            
            self.max_length = max(self.max_length, length+1)
            if (direction == 0):
                countZigZag(node.left, 0, 0)
                countZigZag(node.right, 1, length+1)
            elif (direction == 1):
                countZigZag(node.left, 0, length+1)
                countZigZag(node.right, 1, 0)
            return
        
        countZigZag(root.left, 0, 0)
        countZigZag(root.right, 1, 0)
        return self.max_length

            
