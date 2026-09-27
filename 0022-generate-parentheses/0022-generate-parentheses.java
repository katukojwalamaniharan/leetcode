class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        solve(n,0,0,curr,ans);
        return ans;
    }
    
    public static void solve(int n,int open,int close,StringBuilder curr,List<String>ans){
        if(open == n && close == n){
            ans.add(curr.toString());
            return;
        }
        if(open<n){
            curr.append('(');
            solve(n,open+1,close,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(")");
            solve(n,open,close+1,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}