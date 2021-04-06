class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0) return res;
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int i =0 ;i < nums.length; i++){
            int compl = target-nums[i];
            if(!map.containsKey(compl)){
                map.put(nums[i], i);
            }else{
                res[0] = map.get(compl);
                res[1] = i;
                return res;
            }
        }
        return res;
    }
}