class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        h(root,ans);
        return ans;
    }
    void h(Node root,List<Integer> ans){
        if(root == null) return;
        for(Node n:root.children){
            h(n,ans);
        }
        ans.add(root.val);
    }
}