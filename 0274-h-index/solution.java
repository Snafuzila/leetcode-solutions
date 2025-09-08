class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];

        // Step 1: Count each citation
        for (int c : citations) {
            if (c >= n) {
                count[n]++; // Group all citations >= n into count[n]
            } else {
                count[c]++;
            }
        }

        // Step 2: Iterate from highest to lowest
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += count[i]; // total papers with at least i citations
            if (total >= i) {
                return i; // Found the h-index
            }
        }

        return 0;
    }
}

