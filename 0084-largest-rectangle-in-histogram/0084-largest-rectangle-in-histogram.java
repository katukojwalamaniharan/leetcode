class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = Integer.MIN_VALUE;
        int n = heights.length;
        int[] ns = nsi(heights);
        int[] ps = psi(heights);
        for(int i=0;i<n;i++){
            int temp = heights[i]*(ns[i]-ps[i]-1);
            ans=Math.max(ans,temp);
        }
        return ans;
    }
    public int[] nsi(int[] h){
        int n=h.length;
        int[] ans = new int[n];
        Arrays.fill(ans,n);
        Stack<Integer> wr = new Stack<>();
        for(int i=0;i<n;i++){
            while(!wr.empty() && h[i] < h[wr.peek()]) ans[wr.pop()]=i;
            wr.add(i);
        }
        return ans;
    }
    public int[] psi(int[] h){
       int  n=h.length;
        int[] ans = new int[n];//created ans array
        Arrays.fill(ans,-1); //filler with 
        Stack<Integer> wr = new Stack<>();
        for(int i=n-1;i>=0;i--){
            //checking does the stack is not empty and current element is 
            while(!wr.empty() && h[i] < h[wr.peek()]) ans[wr.pop()]=i;
            wr.add(i);
        }
        return ans;
    }
}