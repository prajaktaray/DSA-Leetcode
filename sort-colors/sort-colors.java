class Solution {
    public void sortColors(int[] nums) {
        if(nums == null|| nums.length ==0) return;
        int low=0,high = nums.length-1,mid =0;
        while(mid<=high){
            if(nums[mid] == 1) mid++;
            else if( nums[mid] == 2) {
                swap(nums,mid,high);
                high--;
            }else{
                swap(nums,mid,low);
                low++;
                mid++;
            }
        }
        
    }
    
    private void swap(int[] nums, int low, int high){
        int temp = nums[low];
        nums[low]= nums[high];
        nums[high]= temp;
    }
}
