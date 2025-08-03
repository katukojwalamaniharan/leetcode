class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int[] arr={-1,-1};
        int temp=0;
        int r=numbers.length-1;
        while(l<r){
            temp=numbers[l]+numbers[r];
            
             if(temp==target){
                arr[0]=l+1;
                arr[1]=r+1;
                return arr;
            }
            else if(temp>target){
                r--;
            }
            else{
                l++;
            }

        }

        return arr;
    }
}