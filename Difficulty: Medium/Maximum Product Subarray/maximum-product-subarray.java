class Solution {
    int maxProduct(int[] arr) {
        // code here
        int min = arr[0];
        int max = arr[0];
        int ans = arr[0];
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int newMax = Math.max(curr,Math.max(curr*max,curr*min));
            int newMin = Math.min(curr,Math.min(curr*min,curr*max));
            max = newMax;
            min = newMin;
            ans = Math.max(ans,max);
        }
        return ans;
    }
}