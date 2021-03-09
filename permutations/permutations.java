class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        for(int n:nums){
            input.add(n);
        }
       // input.add(Arrays.asList(nums));
        backtrack(input,output,0);
        return output;       
        
    }
    
    private List<List<Integer>> backtrack(List<Integer> nums, List<List<Integer>> output, int first){
        if(first==nums.size()) output.add(new ArrayList<Integer>(nums));
        for(int i=first;i<nums.size();i++){
            Collections.swap(nums,first,i);
            backtrack(nums,output,first+1);
            Collections.swap(nums,first,i);
        }
        return output;
    }
}