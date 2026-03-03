/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> tempAns = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp = q.poll();
                tempAns.add(temp.val);
                if(temp.children!=null){
                    for(Node c:temp.children) q.add(c);
                }
            }
            ans.add(tempAns);
        }
        return ans;
    }
}