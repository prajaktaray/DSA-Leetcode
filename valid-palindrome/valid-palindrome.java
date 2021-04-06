class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;
        int right = s.length()-1;
        int left = 0;
        while(left < right){
            if(Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))){
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
                else {
                    right--;left++;
                }
            }else{
                if(!Character.isLetterOrDigit(s.charAt(left))) left++;
                if(!Character.isLetterOrDigit(s.charAt(right))) right--;
                
            }
        }
        return true;
    }
}