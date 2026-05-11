class Solution {
    public boolean closeStrings(String word1, String word2) {
        // 1. בדיקת אורך בסיסית
        if (word1.length() != word2.length()) {
            return false;
        }

        // יצירת שתי מפות לתדירויות
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // 2. בדיקה ששתי המחרוזות מכילות את אותו סט של אותיות ייחודיות
        // (keySet() מחזיר Set של כל המפתחות במפה)
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        // 3. בדיקה שהתפלגות התדירויות זהה
        // אנחנו מוציאים את הערכים (הכמויות), ממיינים אותם ומשווים
        List<Integer> values1 = new ArrayList<>(map1.values());
        List<Integer> values2 = new ArrayList<>(map2.values());

        Collections.sort(values1);
        Collections.sort(values2);

        return values1.equals(values2);
    }
}
