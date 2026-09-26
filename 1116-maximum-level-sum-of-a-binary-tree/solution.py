# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: TreeNode | None) -> int:
        if not root:
            return 0
        
        maximal = (root.val, 1)
        queue = deque([root])
        level = 0
        while (queue):
            level+=1
            levelsum = 0
            level_size = len(queue)
            for i in range(level_size):
                node = queue.popleft()
                levelsum+=node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            if levelsum>maximal[0]:
                maximal = (levelsum, level)
            
        return maximal[1]
        
        
