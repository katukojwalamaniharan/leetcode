class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<2) return intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> al = new ArrayList<>();
        int[] prev = intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] curr = intervals[i];
            if(prev[1]>=curr[0]){
                prev = new int[]{prev[0],Math.max(prev[1],curr[1])};
            }else{
                al.add(prev);
                prev = curr;
            }
        }
        al.add(prev);
        int[][] ans = new int[al.size()][2];
        for(int i=0;i<ans.length;i++){
            ans[i]=al.get(i);
        }
        return ans;
    }
}