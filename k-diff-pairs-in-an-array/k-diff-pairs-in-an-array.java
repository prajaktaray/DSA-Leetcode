class Solution {
    public int findPairs(int[] nums, int k) {
        
        int result =0;
        if(nums.length==0 || nums==null) return result;
        Arrays.sort(nums);
        int left=0;int right=1;
        while(left<nums.length && right<nums.length){
            if(nums[left] + k < nums[right]){
                left++;
            }else if(nums[left] + k > nums[right] || left==right){
                right++;
            }else{                
				result++;
                left++;
                while(left<nums.length && nums[left] == nums[left-1] ) left++;
            }
        }
        return result;
    }
}