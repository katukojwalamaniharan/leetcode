class Solution {
    public boolean uniformArray(int[] nums1) {
        return helperr(nums1);
    }
    boolean helperr(int[] nums1){
        int[] rr = nums1;
        int mm = Integer.MAX_VALUE;
        boolean ho = false;
        for(int x:rr){
            if(x<mm) mm = x;
            if((x&1)==1) ho = true;
        }
        return (mm&1)==1||!ho;
    }
}