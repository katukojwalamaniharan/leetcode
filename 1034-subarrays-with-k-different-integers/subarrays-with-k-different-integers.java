class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return help(nums,k)-help(nums,k-1);
    }
    public int help(int[] nums,int k){
        int r=0,l=0;
        int n=nums.length;
        int count=0;
        if(k==0) return 0;
        // HashMap<Integer,Integer> hm=new HashMap<>();
        int[] freq= new int[nums.length+1];
        int d=0;
        while(r<n){
            int num=nums[r];
            // hm.put(num,hm.getOrDefault(num,0)+1);
            if(freq[num]==0) d++; // to track the distinct elements.
            freq[num]++;
            while(d>k){
                // hm.put(nums[l],hm.get(nums[l])-1);
                // if(hm.get(nums[l])==0) hm.remove(nums[l]);
                freq[nums[l]]--;
                if(freq[nums[l]]==0) d--;
                l++;
            }
            if(d<=k) count+=r-l+1;
            r++;
        }
        return count;
    }
}