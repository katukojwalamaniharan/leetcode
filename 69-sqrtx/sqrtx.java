class Solution {
    public int mySqrt(int x) {
        if(x==1||x==0)return x;
        if(x<4) return 1; 
        int l=1;
        int r=x/2;
        int res=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((long)mid*mid>x){
                r=mid-1;
            }else if((long)mid*mid<x){
                l=mid+1;
                res=mid;
            }else{
                return mid;
            }
        }
        return res;
    }
}