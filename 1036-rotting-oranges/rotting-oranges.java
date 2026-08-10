class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int r = grid.length;
        int c = grid[0].length;
        int[][]dir = {
            {-1,0},
            {0,1},
            {1,0},
            {0,-1}
        };
        int f = 0;
        int rot = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == 1) f++;
                if(grid[i][j] == 2) {
                    q.add(new int[]{i,j,0});
                    rot++;    
                }
            }
        }
        if(f == 0) return 0;
        if(rot == 0) return -1;
        int ans = 0;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int time = curr[2];
            for(int i=0;i<4;i++){
                int ni = curr[0]+dir[i][0];
                int nj = curr[1]+dir[i][1];

                if(ni<0||ni>=r || nj<0||nj>=c || grid[ni][nj] == 2||grid[ni][nj] == 0) continue;
                q.add(new int[]{ni,nj,time+1});
                f--;
                ans = Math.max(ans,time+1);
                grid[ni][nj]=2;
            }
        }
        return f == 0?ans:-1;
    }
}