class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        freq_map = {}
        for num in arr:
            freq_map[num] = freq_map.get(num, 0) + 1

        frequencies = list(freq_map.values())
        return len(set(frequencies)) == len(frequencies)
