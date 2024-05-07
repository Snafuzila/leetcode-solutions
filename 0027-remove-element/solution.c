int removeElement(int* nums, int numsSize, int val) {
    int k = 0; // Initialize counter for elements not equal to val

    // Iterate through the array
    for (int i = 0; i < numsSize; i++) {
        // If current element is not equal to val, copy it to nums[k]
        if (nums[i] != val) {
            nums[k] = nums[i];
            k++; // Increment counter
        }
    }

    return k; // Return number of elements not equal to val
}
