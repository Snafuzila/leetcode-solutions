class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right;
        int n = nums.length;
        
        for (right = 0; right < n; right++) {
            // אם פגשנו 0, אנחנו משתמשים באחד ה-flips שלנו
            if (nums[right] == 0) {
                k--;
            }
            
            // אם חרגנו מכמות ה-flips המותרת (k הפך לשלילי)
            if (k < 0) {
                // אם המספר שיוצא מהחלון (משמאל) הוא 0, אנחנו מקבלים את ה-flip חזרה
                if (nums[left] == 0) {
                    k++;
                }
                // מצמצמים את החלון משמאל
                left++;
            }
        }
        
        // אורך החלון בסוף הריצה הוא התוצאה המקסימלית
        return right - left;
    }
}
