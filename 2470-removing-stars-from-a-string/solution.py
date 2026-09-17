class Solution:
    def removeStars(self, s: str) -> str:
        stack = []
        counter=0
        for char in s:
            stack.append(char)
        str = ""
        while stack:
            c = stack.pop()
            if c != '*' and counter==0:
                str=c+str
            elif c!= '*' and counter>0:
                counter-=1
            elif c=='*':
                counter+=1                
        return str

