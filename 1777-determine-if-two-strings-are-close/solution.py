class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1) != len(word2):
            return False

        freq1 = {}
        for char in word1:
            freq1[char] = freq1.get(char, 0) + 1

        freq2 = {}
        for char in word2:
            freq2[char] = freq2.get(char, 0) + 1

        if set(freq1.keys()) != set(freq2.keys()):
            return False

        vals1 = sorted(freq1.values())
        vals2 = sorted(freq2.values())

        return vals1 == vals2
