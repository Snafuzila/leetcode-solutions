class Solution:
    def reverseVowels(self, s: str) -> str:
        first= 0
        last = len(s)-1
        temp = ''
        vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}
        s = list(s)

        while first<last:
            while first < last and s[first] not in vowels:
                first += 1
            while first < last and s[last] not in vowels:
                last -= 1
            temp = s[last]
            s[last] = s[first]
            s[first] = temp
            last-=1
            first+=1
            
        return ''.join(s)
