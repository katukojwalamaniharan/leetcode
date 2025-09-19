class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return help(nums,k)-help(nums,k-1);
    }
    public int help(int[] nums,int k){
        int r=0,l=0;
        int n=nums.length;
        int count=0;
        if(k==0) return 0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(r<n){
            int num=nums[r];
            hm.put(num,hm.getOrDefault(num,0)+1);
            while(hm.size()>k){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0) hm.remove(nums[l]);
                l++;
            }
            if(hm.size()<=k) count+=r-l+1;
            r++;
        }
        return count;
    }
}