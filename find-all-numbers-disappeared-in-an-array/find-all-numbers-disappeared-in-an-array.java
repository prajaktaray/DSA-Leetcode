class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums==null || nums.length ==0) return new ArrayList<Integer>(0);
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i]);
            if(nums[idx-1] >0) nums[idx-1] *= -1;
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] >0) result.add(i+1);
        }
        return result;
    }
}
