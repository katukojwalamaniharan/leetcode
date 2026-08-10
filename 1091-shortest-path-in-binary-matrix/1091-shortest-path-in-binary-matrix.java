class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
        int ans = -1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,1});
        int[][] v = new int[grid.length][grid.length];
        v[0][0] = 1;
        int[][] dir = {
            {-1, -1},  // top-left
            {-1,  0},  // top
            {-1,  1},  // top-right
            { 0, -1},  // left
            { 0,  1},  // right
            { 1, -1},  // bottom-left
            { 1,  0},  // bottom
            { 1,  1}   // bottom-right
        };
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int i = curr[0];
            int j = curr[1];
            int l = curr[2];
            if(i == grid.length-1 && j == grid.length-1) return l;
            for(int d=0;d<=7;d++){
                int ni = i + dir[d][0];
                int nj = j + dir[d][1];
                if(Math.min(ni,nj)<0 || Math.max(ni,nj)>=n || v[ni][nj] == 1 || grid[ni][nj] == 1) continue;
                q.add(new int[]{i+dir[d][0],j+dir[d][1],l+1});
                v[i+dir[d][0]][j+dir[d][1]] = 1;
            }
        }
        return -1;
    }
}