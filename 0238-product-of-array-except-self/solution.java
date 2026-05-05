class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; // ב-Java מערך הוא length ולא length()
        int[] answer = new int[n]; // יצירת מערך חדש בגודל n
        
        // אתחול המערך ב-1 (בפייתון זה קורה בשורה אחת, ב-Java צריך לולאה או fill)
        for (int i = 0; i < n; i++) {
            answer[i] = 1;
        }

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] *= prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        
        return answer;
    }
}
