class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n + 1) * n / 2;
        for (int i = 0; i < n; i++) {
            total -= nums[i];
        }
        return total;
    }
}