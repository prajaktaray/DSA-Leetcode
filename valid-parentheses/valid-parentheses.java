class Solution {
    public boolean isValid(String s) {
        if(s==null||s.length() ==0) return true;
       // if(s.length() ==1) return false;
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') st.push(s.charAt(i));
            else{
                if(st.size()==0) return false;
                char stackTop = st.pop();
                char curr = s.charAt(i);
                //System.out.println(sta)
                if(stackTop != map.get(curr)) return false;
            }
        }
        return st.isEmpty() && true;
        
    }
}
