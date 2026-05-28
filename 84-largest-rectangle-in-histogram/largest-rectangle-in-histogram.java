class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] pse = pse(heights);
        int[] nse = nse(heights);
        int ans = 0;
        for(int i=0;i<heights.length;i++){
            ans = Math.max(ans,(nse[i]-pse[i]-1)*heights[i]);
        }
        return ans;
    }
    public static int[] pse(int[] arr){
        int[] ans = new int[arr.length];
        Arrays.fill(ans,-1);
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            while(!s.isEmpty() && arr[s.peek()]>=num) s.pop();
            if(s.isEmpty()){

            }else{
                ans[i]=s.peek();
            }
            s.push(i);
        }
        return ans;
    }
    public static int[] nse(int[] arr){
        int[] ans = new int[arr.length];
        Arrays.fill(ans,arr.length);
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int num = arr[i];
            while(!s.isEmpty() && arr[s.peek()]>=num) s.pop();
            if(s.isEmpty()){

            }else{
                ans[i]=s.peek();
            }
            s.push(i);
        }
        return ans;
    }
}