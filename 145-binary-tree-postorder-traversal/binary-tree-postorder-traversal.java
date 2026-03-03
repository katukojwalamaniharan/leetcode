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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.add(root);
        while(!s1.isEmpty()){
            TreeNode temp = s1.pop();
            s2.add(temp);
            if(temp.left!=null) s1.add(temp.left);
            if(temp.right!=null) s1.add(temp.right);
        }
        while(!s2.isEmpty()){
            ans.add(s2.pop().val);
        }
        return ans;
    }
}