class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        if(num.length() == k) return "0";
        for(int i=0;i<num.length();i++){
            int n = num.charAt(i)-'0';
            while(!st.isEmpty() && k>0 && st.peek()>n){
                st.pop();
                k--;
            }
            st.push(n);
        }
        while(k>0 ){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String ans = sb.reverse().toString();
        ans = rtz(ans);
        return ans;
    }
    public static String rtz(String s){
        int i=0;
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        s=(i==s.length())?"0":s.substring(i);
        return s;
    }
}