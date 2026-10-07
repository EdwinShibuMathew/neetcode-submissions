class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char c = ' ', p = ' ';
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                p = st.pop();
                if((p == '(' && c != ')')||(p == '{' && c != '}')||(p == '[' && c != ']')){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
