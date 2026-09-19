from collections import deque

class Solution:
    def predictPartyVictory(self, senate: str) -> str:
        queue_R = deque()
        queue_D = deque()
        n = len(senate)
        
        # 1. Populate the queues with the indices of each party's senators
        for i, party in enumerate(senate):
            if party == 'R':
                queue_R.append(i)
            else:
                queue_D.append(i)
                
        # 2. Simulate the voting rounds until one queue is empty
        while queue_R and queue_D:
            r_index = queue_R.popleft()
            d_index = queue_D.popleft()
            
            # The senator with the smaller index acts first and bans the other
            # The survivor goes back to the queue for the next round (index + n)
            if r_index < d_index:
                queue_R.append(r_index + n)
            else:
                queue_D.append(d_index + n)
                
        # 3. Whichever queue still has senators remaining wins
        return "Radiant" if queue_R else "Dire"
