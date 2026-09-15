class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        maximum = 0
        current = 0
        for i, num in enumerate(gain):
            current+=num
            maximum = max(maximum, current)
        return maximum
