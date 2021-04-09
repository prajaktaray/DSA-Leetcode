class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1 || nums == null) return nums.length;
        int slow = 1, ctr = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                ctr++;
            }else{
                ctr = 1;
            }
            if(ctr <= 1){
                nums[slow++] = nums[i];
            }
        }
        return slow;
    }
}