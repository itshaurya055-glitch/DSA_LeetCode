class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0; // Position where the next non-zero element should go

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap only if needed
                if (i != insertPos) {
                    int temp = nums[i];
                    nums[i] = nums[insertPos];
                    nums[insertPos] = temp;
                }
                insertPos++;
            }
        }
    }
}
