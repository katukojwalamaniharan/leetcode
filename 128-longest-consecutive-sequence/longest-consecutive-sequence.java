class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int ans=1;
        int n=nums.length;
        Set<Integer> ss=new HashSet<>();
        for(int x:nums){
            ss.add(x);
        }
        int[] arr=new int[ss.size()];
        int idx=0;
        for(Integer x:ss){
            arr[idx++]=x;
        }
        Arrays.sort(arr);
        int len=1;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]+1)==arr[i+1]){
                len++;
            }else{
                len=1;
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}