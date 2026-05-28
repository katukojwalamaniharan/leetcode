class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = Integer.MIN_VALUE;
        int n = heights.length;
        int[] ps = psi(heights);
        int[] ns = nsi(heights);
        for(int i=0;i<n;i++){
            int temp = heights[i]*(ps[i]-ns[i]-1);
            ans=Math.max(ans,temp);
        }
        return ans;
    }
    public int[] psi(int[] h){
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
    public int[] nsi(int[] h){
       int  n=h.length;
        int[] ans = new int[n];//created ans array
        Arrays.fill(ans,-1); //filler with 
        Stack<Integer> wr = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!wr.empty() && h[i] < h[wr.peek()]) ans[wr.pop()]=i;
            wr.add(i);
        }
        return ans;
    }
}