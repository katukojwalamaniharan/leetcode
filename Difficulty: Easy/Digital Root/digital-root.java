class Solution {
    public int digitalRoot(int n) {
        while(!okay(n)){
            n = help(n);
        }
        return n;
        
    }
    public boolean okay(int n){
        return n<10;
    }
    public int help(int n){
        int ans = 0;
        while(n>0){
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
};