class Solution {
    public int mySqrt(int x) {
        if (x==0||x==1) return x;
        if(x<4) return 1; 
        int ans=0;
        for(int i=1;i<=x/2+1;i++){
            if((long)i*i==x){
                ans=i;
                break;
            }else if((long)i*i>x){
                ans=i-1;
                break;
            }
        }
        return ans;   
    }
}