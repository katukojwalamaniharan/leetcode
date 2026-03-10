class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                // level.add(node.val);
                if(node.right == null && node.left == null) return depth;
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            depth++;
        }

        return depth;
    }
}