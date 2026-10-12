class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else if (!stack.isEmpty())
            {
                char cpop = stack.pop();
                if (c == ')' && cpop == '(') continue;
                else if (c == '}' && cpop == '{') continue;
                else if (c == ']' && cpop == '[') continue;
                return false;
            }
            else return false;
            
        }
        return stack.isEmpty() ? true : false;
    }
}