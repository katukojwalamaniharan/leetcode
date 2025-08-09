class Solution {
    public int trap(int[] height) {
        int ans=0;
        //int water_level=0;
        int[] prefix=new int[height.length];
        int[] suffix=new int[height.length];
        prefix[0]=height[0];
        for(int i=1;i<height.length;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        suffix[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        for(int i=0;i<height.length;i++){
                int left=prefix[i];
                int right=suffix[i];
            if((left>height[i])&&(right>height[i])){
                int water_level=Math.min(right,left);
                int water=water_level-height[i];
                if(water>0){
                    ans+=water;
                }
            }
        }
        return ans;
    }
}