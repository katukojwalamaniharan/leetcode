class Solution {
    public int deepestLeavesSum(TreeNode root) {
        // int d = depth(root);
        int sum = 0;
        // int depth = 0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return 0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            // depth++;
            sum = 0;
            for(int i=1;i<=size;i++){
                TreeNode temp = q.poll();
                // if(depth == d) 
                sum+=temp.val;
                if(temp.right!=null) q.add(temp.right);
                if(temp.left!=null) q.add(temp.left);
            }
        }
        return sum;
    }
    // int depth(TreeNode root){
    //     if(root == null) return 0;
    //     int r = depth(root.right);
    //     int l = depth(root.left);
    //     return 1+Math.max(l,r);
    // }
}