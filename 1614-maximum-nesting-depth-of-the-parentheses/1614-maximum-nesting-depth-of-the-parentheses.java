class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int temp = 0;
        for(char c:s.toCharArray()){
            if(c == '('){
                temp++;
            }else if(c == ')'){
                temp--;
            }
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}