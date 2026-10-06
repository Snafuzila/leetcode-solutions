class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest = "";
        int shortestLen = 200;       
        for (String s: strs)
        {
            if (s.length()<shortestLen)
            {
                shortest = s;
                shortestLen = s.length();
            }
        }
        for (int i = 0; i<shortest.length();i++)
        {
            for (int j = 0; j<strs.length-1; j++)
            {
                if (strs[j].charAt(i)!=strs[j+1].charAt(i))
                {
                    if (i == 0) return "";
                    else return shortest.substring(0, i);
                }
            }
        }
        return shortest;
    }
}