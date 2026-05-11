class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            // אם פגשנו אפס, נספור אותו
            if (nums[right] == 0) {
                zeros++;
            }

            // אם יש יותר מאפס אחד בחלון, נצמצם משמאל
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            // עדכון המקסימום: גודל החלון הנוכחי הוא (right - left + 1)
            // אבל אנחנו חייבים למחוק איבר אחד (את האפס), אז מחסירים 1
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
