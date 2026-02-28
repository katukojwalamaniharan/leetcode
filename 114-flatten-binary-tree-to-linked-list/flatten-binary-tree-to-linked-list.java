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
    public void flatten(TreeNode root) {
        TreeNode temp = null;
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return;
        st.add(root);
        while(!st.isEmpty()){
            TreeNode t = st.pop();
            if(t.right!=null) st.add(t.right);
            if(t.left!=null) st.add(t.left);
            if(temp == null){
                temp = t;
            }else{
                temp.right = t;
                temp.left = null;
                temp = t;
            }
        }
    }
}