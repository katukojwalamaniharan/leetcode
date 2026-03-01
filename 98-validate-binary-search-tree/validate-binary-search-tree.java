/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        long prev = Long.MIN_VALUE;
        if(root == null) return true;
        if(root.right == null && root.left == null) return true;
        Stack<TreeNode> st = new Stack<>();
        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.add(root);
                root = root.left;
            }
            root = st.pop();
            if(root.val<=prev) return false;
            prev = root.val;
            root = root.right;
        }
        return true;
    }
}