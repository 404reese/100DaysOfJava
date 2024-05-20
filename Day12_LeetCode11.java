class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxWater=0;
        while(i<j){
            int h = Math.min(height[i],height[j]);
            int w = j-i;
            int cWater = h*w;
            maxWater = Math.max(cWater,maxWater);
            if (height[i]>height[j]){
                j--;
            }else {
                i++;
            }
        }
        return maxWater;
    }
}


//best solution
class Solution {
    public int maxArea(int[] height) {
         int left=0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            max = Math.max(max, h*(right - left));
            while(left < right && height[left] <= h){
                left++;
            }
            
            while(left < right && height[right] <= h){
                right--;
            }
        }
        return max;
    }
}