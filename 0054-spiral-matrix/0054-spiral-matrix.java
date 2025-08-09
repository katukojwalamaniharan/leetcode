class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int cs=0;
        int rs=0;
        int ce=matrix[0].length-1;
        int re=matrix.length-1;
        List<Integer> ans=new ArrayList<>();
        while(cs<=ce&&rs<=re){
            //top
            for(int i=cs;i<=ce;i++){
                ans.add(matrix[rs][i]);
            }
            rs++;
            //down
            for(int i=rs;i<=re;i++){
                ans.add(matrix[i][ce]);
            }
            ce--;
            //bottom
            if(rs<=re){
                for(int i=ce;i>=cs;i--){
                ans.add(matrix[re][i]);
            }
            }
            re--;
            //up
           if(cs<=ce){
             for(int i=re;i>=rs;i--){
                ans.add(matrix[i][cs]);
            }
           }
            cs++;
        }
        return ans;
    }
}