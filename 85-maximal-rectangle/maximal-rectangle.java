class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] heights = new int[col];
        int ans = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }

            ans = Math.max(ans, lra(heights));
        }

        return ans;
    }
    public int lra(int[] heights) {
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