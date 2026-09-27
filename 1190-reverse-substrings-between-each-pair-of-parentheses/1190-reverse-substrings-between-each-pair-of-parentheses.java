class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c == '('){
            //new starting of a word add the current substring
                st.push(ans.toString());
                ans = new StringBuilder();
            }else if(c == ')'){
                ans.reverse();
                ans = new StringBuilder(st.pop()+ans.toString());
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}