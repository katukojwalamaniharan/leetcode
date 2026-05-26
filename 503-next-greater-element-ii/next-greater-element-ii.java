class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans,-1);
        int n = nums.length;
        for(int i=2*n-1;i>=0;i--){
            int num = nums[i%n];
            while(!st.isEmpty() && st.peek()<=num) st.pop();
            if(st.isEmpty()){
                ans[i%n]=-1;
            }else{
                ans[i%n]=st.peek();
            }
            st.push(num);
        }
        return ans;
    }
}