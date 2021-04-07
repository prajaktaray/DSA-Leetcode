class Solution {
    public int findMaxLength(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int currSum =0, maxLength =0;
        map.put(0,-1);
        
        for(int i =0; i < nums.length; i++){
            currSum += nums[i] == 0 ? -1: 1;
            
            if(map.containsKey(currSum)){
                int start = map.get(currSum)+1;
                maxLength = Math.max(maxLength, i-start+1);
            }else{
                map.put(currSum,i);
            }
            
            
        }
        
        return maxLength;
        
    }
}