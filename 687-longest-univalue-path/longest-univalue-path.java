class Solution{
    int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        help(root);
        return ans;
    }
    int help (TreeNode curr){
        if(curr == null) return 0;
        int l = help(curr.left);
        int r = help(curr.right);
        if(curr.left!=null && curr.val == curr.left.val)
            l++;
        else
            l=0;
        if(curr.right!=null && curr.val == curr.right.val)
            r++;
        else
            r=0;
        ans = Math.max(ans,l+r);
        return Math.max(l,r);
    }
}