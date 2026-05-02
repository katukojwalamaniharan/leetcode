
class Solution {
    public boolean isValidBST(TreeNode root) {
        long low = Long.MIN_VALUE;
        long high = Long.MAX_VALUE;
        return check(root,low,high);
    }
    public boolean check(TreeNode root,long low,long high){
        if(root == null) return true;
        if(root.val>=high || root.val<=low) return false;
        return check(root.left,low,root.val)&&check(root.right,root.val,high);
    }
}