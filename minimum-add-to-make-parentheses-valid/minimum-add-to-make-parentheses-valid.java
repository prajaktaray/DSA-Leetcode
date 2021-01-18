class Solution {
    public int minAddToMakeValid(String S) {
        if(S==null || S.length()==0) return 0;
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch == '(') st.push(ch);
            else {
                if(st.isEmpty()) count++;
                else st.pop();
            }
        }
        return count+ st.size();
        
    }
}
