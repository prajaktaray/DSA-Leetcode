class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearchLeft(nums,target,0,nums.length-1);
        int right = binarySearchRight(nums,target,0,nums.length-1);
        return new int[] {left,right};        
    }
    private int binarySearchLeft(int[] nums, int target, int low, int high){
        
        while(low <= high){
            int mid = low + (high-low) /2;
            if(nums[mid] == target){
                if(mid == low || nums[mid-1] != target){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }else if( nums[mid] > target){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return -1;        
    }
    
    private int binarySearchRight(int[] nums, int target, int low, int high){
      
        while(low <= high){
            int mid = low + (high-low) /2;
            if(nums[mid] == target){
                if(mid == high || nums[mid+1] != target){
                    return mid;
                }
                else{
                    low = mid+1;
                }
            }else if( nums[mid] > target){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return -1;
        
    }
}