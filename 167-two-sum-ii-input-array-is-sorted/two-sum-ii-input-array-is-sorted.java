class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        //int[] arr={-1,-1};
        while(l<=r){
            int temp=numbers[l]+numbers[r];
            if(temp==target){
                return new int[] {l+1,r+1};
            }else if(temp>target){
                r--;
            }else{
                l++;
            }
        }
        return new int[] {-1,-1};
    }
}