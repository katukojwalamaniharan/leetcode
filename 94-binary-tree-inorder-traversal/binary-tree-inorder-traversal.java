class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        // st.add(root);

        while(true){
            if(root!=null){
                st.add(root);
                root = root.left;
            }else{
                if(st.isEmpty()) break;
                root = st.pop();
                ans.add(root.val);
                root = root.right;
            }
        }
        return ans;
    }
}