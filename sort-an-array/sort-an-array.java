class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[i]){
                    int temp= nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
      return nums;
    }
}
