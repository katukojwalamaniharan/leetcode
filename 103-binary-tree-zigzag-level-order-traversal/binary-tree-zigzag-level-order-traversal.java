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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        int count = 0;
        boolean normal = false;
        while(!q.isEmpty()){
            List<Integer> t = new LinkedList<>();
            int size = q.size();
            count++;
            normal = !normal;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                if(!normal){
                    t.add(0,temp.val);
                }else{
                    t.add(temp.val);
                }
            }
            ans.add(t);
        }
        return ans;
    }
}