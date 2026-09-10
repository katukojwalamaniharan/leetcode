class Solution {
    // public int maxWater(int arr[]) {
    //     // Code Here
        
    // }
    public int maxWater(int[] h) {
            int ans = 0;
            int i=0;
            int j=h.length-1;
            while(i<j&&i<h.length){
                int capacity = (j-i)*Math.min(h[i],h[j]);
                // System.out.println(capacity);
                if(h[i]>h[j]){
                    j--;
                }else{
                    i++;
                }
                ans = Math.max(ans,capacity);
            }
            return ans;
        }
}