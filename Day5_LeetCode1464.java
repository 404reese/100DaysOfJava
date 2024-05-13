//1st approach
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        int p = (nums[0] - 1) * (nums[1] - 1);
        return p;
    }
}

//optimized
class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max <= nums[i]) {
                sMax = max;
                max = nums[i];
            } else if (sMax <= nums[i] && max > nums[i]) {
                sMax = nums[i];
            }
        }

        int p = (max - 1) * (sMax - 1);
        return p;
    }
}