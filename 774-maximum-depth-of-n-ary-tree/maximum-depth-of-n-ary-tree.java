/*
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root == null) return 0;
        int ans = 0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node temp = q.poll();
                for(Node child:temp.children){
                    q.add(child);
                }
            }
            ans++;
        }
        return ans;
    }
}