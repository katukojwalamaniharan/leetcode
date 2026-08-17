class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<=nums.length+1;i++){
            if(!bs(nums,i)) return i;
        }
        return -1;
    }
    public boolean bs(int[] arr,int target){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid]<target){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return false;
    }
}