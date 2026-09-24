# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: TreeNode | None, targetSum: int) -> int:
        # Dictionary to store how many times each prefix sum has occurred
        prefix_counts = defaultdict(int)
        
        # Base case: A prefix sum of 0 has occurred once (for paths starting right from the root)
        prefix_counts[0] = 1
        
        def dfs(node, current_sum):
            if not node:
                return 0
            
            # 1. Update the running sum for the current path
            current_sum += node.val
            
            # 2. Find how many previous prefix sums satisfy: current_sum - targetSum = old_sum
            needed_sum = current_sum - targetSum
            num_paths = prefix_counts[needed_sum]
            
            # 3. Record the current sum into our map so children can use it
            prefix_counts[current_sum] += 1
            
            # 4. Recursively explore left and right children
            num_paths += dfs(node.left, current_sum)
            num_paths += dfs(node.right, current_sum)
            
            # 5. BACKTRACK: Remove the current sum before moving back up to a parent branch
            prefix_counts[current_sum] -= 1
            
            return num_paths
        
        return dfs(root, 0)
        
