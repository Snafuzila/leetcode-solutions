class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = n-1;

        while (i>=0)
        {
            while (i>= 0 && s.charAt(i) == ' ')
            {
                i--;
            }
            if (i<0) break;

            int wordEnd = i;
            while (i>=0 && s.charAt(i)!= ' ')
            {
                i--;
            }
            if (result.length()>0)
            {
                result.append(' ');
            }
            result.append(s.substring(i + 1, wordEnd + 1));
        }
        return result.toString();

    }
}
