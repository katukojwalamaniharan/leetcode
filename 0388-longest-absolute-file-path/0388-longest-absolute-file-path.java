class Solution {
    public int lengthLongestPath(String input) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(String s:input.split("\n")){
            //level finding
            int l = s.lastIndexOf('\t')+1;
            while(st.size()>l){
                st.pop();
            }
            String name = s.substring(l);
            int pl = st.isEmpty()?0:st.peek();
            if(name.contains(".")){
                ans = Math.max(ans,pl+name.length());
            }else{
                st.push(pl+name.length()+1);
            }
        }
        return ans;
    }
}