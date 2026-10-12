class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int longest = 0;
        int left = 0;

        for (int right = 0; right<s.length(); right++){
            char c = s.charAt(right);
            while (seen.contains(c))
            {
                seen.remove(s.charAt(left++));
            }
            seen.add(c);
            longest = Math.max(longest,right-left+1);

        }
        return longest;
    }
}