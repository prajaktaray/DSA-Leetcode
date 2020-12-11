class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null || nums.length ==0)   return 0;
        int max = 0; int curr=0;
        for(int num:nums){
            if(num ==0){
                max= Math.max(curr,max);
                curr=0;
            }else{
                curr++;
            }
        }
       return Math.max(curr,max); 
    }
}
