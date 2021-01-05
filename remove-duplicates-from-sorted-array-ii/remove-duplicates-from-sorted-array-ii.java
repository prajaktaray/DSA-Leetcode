class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int counter=1;
        int slow=1;
        for(int i=1; i<nums.length; i++){
            //check with prev
            if(nums[i] == nums[i-1]){
                counter++;
            }else counter=1;
            
            //replace
            if(counter<=2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
        
    }
}
