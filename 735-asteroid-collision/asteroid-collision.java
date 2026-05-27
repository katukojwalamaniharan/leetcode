class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<asteroids.length;i++){
            int num = asteroids[i];
            if(num>0){
                st.push(num);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(num)) {
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(num)){
                    st.pop();
                }else if(st.isEmpty() || st.peek()<0){
                    st.push(num);
                }
            }
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        int[] res = new int[ans.size()];

        for(int j = 0; j < ans.size(); j++){
            res[j] = ans.get(j);
        }
        return res;
    }
}