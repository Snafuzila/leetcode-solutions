class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        
        // 1. חלוקת הסנטורים לתורים לפי המיקום המקורי שלהם
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }
        
        // 2. סימולציית ההצבעה
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIdx = radiant.poll();
            int dIdx = dire.poll();
            
            // הסנטור עם האינדקס הנמוך יותר מצביע קודם ומבטל את השני
            if (rIdx < dIdx) {
                // Radiant מנצח ומצטרף לסוף התור לסיבוב הבא
                radiant.add(rIdx + n);
            } else {
                // Dire מנצח ומצטרף לסוף התור לסיבוב הבא
                dire.add(dIdx + n);
            }
        }
        
        // 3. המנצח הוא זה שנשאר לו סנטור בתור
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
