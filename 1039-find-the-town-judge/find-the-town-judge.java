class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n+1];
        int[] out = new int[n+1];
        int ans = -1;
        for(int i=0;i<trust.length;i++){
            int g = trust[i][0];
            int r = trust[i][1];
            in[r]++;
            out[g]++;
        }
        for(int i=1;i<=n;i++){
            if(in[i]==n-1 && out[i]==0){
                return i;
            }
        }
        return -1;
    }
}