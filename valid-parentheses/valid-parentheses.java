class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0)  return true;
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') st.add(s.charAt(i));
            else{
               // char ch = st.pop();
                //if()
                if(st.isEmpty() || st.pop() != map.get(s.charAt(i))) return false;
            }
        }
        
        return st.isEmpty();
    }
}