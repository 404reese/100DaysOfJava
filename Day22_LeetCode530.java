class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }else if ( nums[0]!=nums[1]){
            return nums[0];
        }else if ( nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }

        int start = 0 ;
        int end = nums.length-1 ;

        while(start<=end){
            int mid = (start + end)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else if ( mid % 2 ==1 ){

                if(nums[mid-1]==nums[mid]){
                    start = mid+1 ;
                }else{
                    end = mid-1 ;
                }
            }else { 
                    if(nums[mid]==nums[mid+1]){
                        start = mid +1 ;
                    }else{
                        end = mid -1 ;
                    }
            }
        }

        return -1 ;
    }
}