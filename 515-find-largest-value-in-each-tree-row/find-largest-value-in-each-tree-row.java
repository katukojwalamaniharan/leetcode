class Solution {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                max = Math.max(temp.val,max);
                if(temp.right!=null) q.add(temp.right);
                if(temp.left!=null) q.add(temp.left);
            }
            ans.add(max);
        }
        return ans;
    }
}