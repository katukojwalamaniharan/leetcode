class Solution {
static int[] a = {-1, 0, 1, 0};
static int[] b = {0, 1, 0, -1};
    public int numIslands(char[][] grid) {
        int ans = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]!=1){
                    ans++;
                    dfs(i,j,r,c,grid,visited);
                }
            }
        }
        return ans;
    }
    public void dfs(int si,int sj,int r,int c,char[][] grid,int[][] visited){
        if(si<0||sj<0||si>=r||sj>=c) return;
        if(grid[si][sj] == '0' || visited[si][sj]==1) return;
        visited[si][sj] = 1;
        for(int i=0;i<4;i++){
            dfs(si+a[i],sj+b[i],r,c,grid,visited);
        }
    }
}