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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);//add the first node
        while(!q.isEmpty()){
            int size = q.size();
            Double sum = 0d;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                sum+=temp.val;
                if(temp.right!=null) q.add(temp.right);
                if(temp.left!=null) q.add(temp.left);
            }
            // ans.add((Math.round(t,100000)/100000)/size);
            ans.add(sum/size);
        }
        return ans;
    }
}