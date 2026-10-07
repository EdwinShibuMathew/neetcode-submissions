class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(current == '(' || current == '{' || current == '['){
                st.push(current);
            }else{
                if(st.isEmpty()) return false;
                if(current == ')' || current == '}' || current == ']'){
                    char popped = st.pop();
                    if((popped == '(' && current == ')') || (popped == '{' && current == '}') || (popped == '[' && current == ']')){
                        continue;
                    }else{return false;}
                }
            }
        }
        return st.isEmpty();
    }
}
