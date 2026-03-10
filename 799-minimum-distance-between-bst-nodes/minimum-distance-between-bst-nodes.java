class Solution {
    public int minDiffInBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        Integer prev = null;
        int ans = Integer.MAX_VALUE;
        int temp = 0;
        while(true){
            if(curr!=null){
                s.push(curr);
                curr = curr.left;
            }else{
                if(s.isEmpty()) break;
                curr = s.pop();
                if(prev!=null){
                    ans = Math.min(ans,curr.val - prev);
                }
                prev = curr.val;
                curr = curr.right;
            }
        }
        return ans;
    }
}