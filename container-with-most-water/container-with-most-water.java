class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length<2) return 0;
        int max=0;
        int low=0,high=height.length-1;
        while(low<high){
            int curr = Math.min(height[low],height[high])* (high-low);
            max= Math.max(curr,max);
            if(height[low]<= height[high]) low++;
            else high--;
        }
        return max;
    }
}
