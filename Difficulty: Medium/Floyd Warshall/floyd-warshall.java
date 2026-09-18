class Solution {
    public void floydWarshall(int[][] dist) {
        // Code here
        int inf = (int)1e8;
        int n = dist.length;
        for(int i=0;i<n;i++) dist[i][i] = 0;
        for(int m=0;m<n;m++){
            for(int s=0;s<n;s++){
                for(int e=0;e<n;e++){
                    if(dist[s][m]!=inf && dist[m][e]!=inf){
                        dist[s][e] = Math.min(dist[s][e],dist[s][m]+dist[m][e]);
                    }
                }
            }
        }
                // return dist[source][destination]!=inf;
    }
}