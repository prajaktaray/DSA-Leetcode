class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length ==0) return new int[0];
        int size=nums.length;
        int[] result = new int[size];
        int rp =1;
        for(int i=0; i<size;i++){
            result[i] = rp;
            rp *= nums[i];
        }
        
        rp =1;
        for(int i=size-1;i>=0;i--){
            result[i] *=rp;
            rp *=nums[i];
        }
        
        return result;
        
    }
}
