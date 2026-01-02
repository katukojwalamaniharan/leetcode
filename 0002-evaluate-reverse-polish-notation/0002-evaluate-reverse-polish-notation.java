class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String t:tokens){
            if(isOperator(t)){//used to check does the current is operator or not?
                int b = st.pop();
                int a = st.pop();
                if(t.equals("+")){
                    st.add(a+b);
                }else if(t.equals("-")){
                    st.add(a-b);
                }else if(t.equals("*")){
                    st.add(a*b);
                }else{
                    st.add(a/b);
                }
            }else{
                st.add(Integer.parseInt(t));
            }
        }
        return st.pop();
    }
    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}