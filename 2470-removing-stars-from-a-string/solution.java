class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '*') {
                // פעולת ה-Pop: מוחקים את התו האחרון שהוספנו
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                // פעולת ה-Push: מוסיפים תו למחסנית
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
