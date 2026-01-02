class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                if(c=='(') c = ')';
                else if(c=='[') c=']';
                else c='}';
                st.add(c);
            }else{
                if(!st.empty()&&st.peek()==c){
                        st.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.empty()) return true;
        else return false;
    }
}