# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: ListNode | None) -> int:
        # Step 1: Find the middle of the linked list
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
        # Step 2: Reverse the second half (starting from 'slow')
        prev = None
        curr = slow
        while curr:
            nxt_node = curr.next
            curr.next = prev
            prev = curr
            curr = nxt_node
            
        # Step 3: Compute the max twin sum
        max_sum = 0
        first_half = head
        second_half = prev  # 'prev' is now the head of the reversed second half
        
        while second_half:
            max_sum = max(max_sum, first_half.val + second_half.val)
            first_half = first_half.next
            second_half = second_half.next
            
        return max_sum
