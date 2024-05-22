class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int sum = nums[0];

        for(int i=1 ; i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum += nums[i];
            }else {
                max = Math.max(max , sum);
                sum = nums[i];
            }
        }
         max = Math.max(max , sum);
         return max ;
    }
}