class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character> st=new Stack<>();
        HashMap<Character,Character> map= new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) ==')'||s.charAt(i) ==']'||s.charAt(i) =='}') {
                if(st.isEmpty()) return false;
                char c=st.pop();
                if(c!=map.get(s.charAt(i))) return false;
            }else{
                st.add(s.charAt(i));
            }
        }
        
        if(!st.isEmpty()) return false;
        return true;
        
    }
}