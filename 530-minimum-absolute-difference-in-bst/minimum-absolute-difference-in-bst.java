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
    public int getMinimumDifference(TreeNode root) {
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
                    ans = Math.min(ans,Math.abs(curr.val - prev));
                }
                prev = curr.val;
                curr = curr.right;
            }
        }
        return ans;
    }
}