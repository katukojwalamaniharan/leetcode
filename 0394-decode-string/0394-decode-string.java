class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!=']'){
                st.push(c);
            }else{
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    sb.append(st.pop());
                }
                st.pop();
                sb.reverse();
                StringBuilder num = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num.append(st.pop());
                }
                num.reverse();
                int r = Integer.parseInt(num.toString());
                for(int i=0;i<r;i++) {
                    for(int j=0;j<sb.length();j++){
                        st.add(sb.charAt(j));
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}