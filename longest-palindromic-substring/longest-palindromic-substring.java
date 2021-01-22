class Solution {
    
    public String longestPalindrome(String s) {
        
        if(s.length()<=1) return s;
        int len = s.length();
        int start =0, end=0;
        boolean[][] dp = new boolean[len][len];
        for(int i =0; i<len;i++){
            for(int j=i;j>=0;j--){
                if( s.charAt(i) == s.charAt(j) && (i-j <=2 || dp[i-1][j+1] )) {
                    dp[i][j] = true;
                    if(end-start < i-j){
                        end = i;
                        start = j;
                    }
                }   
            }
        }
        return s.substring(start,end+1);
        
    }
}
