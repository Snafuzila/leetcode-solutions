class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // reduce k if larger than n
        int count = 0; // number of elements moved

        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int nextIdx = (current + k) % n;
                int temp = nums[nextIdx];
                nums[nextIdx] = prev;
                prev = temp;
                current = nextIdx;
                count++;
            } while (start != current); // stop when cycle completes
        }
    }
}

