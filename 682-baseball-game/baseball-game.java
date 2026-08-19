class Solution {
    public int calPoints(String[] o) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<o.length;i++){
            String c = o[i];
            if(c.equals("+")){
                if(st.size()>1){
                    int a = st.pop();
                    int b = st.peek();
                    st.push(a);
                    st.add(a+b);
                }
            }else if(c.equals("D")){
                st.push(2*st.peek());
            }else if(c.equals("C")){
                st.pop();
            }else{
                st.add(Integer.parseInt(c));
            }
        }
        while(!st.isEmpty()) ans+=st.pop();
        return ans;
    }
}