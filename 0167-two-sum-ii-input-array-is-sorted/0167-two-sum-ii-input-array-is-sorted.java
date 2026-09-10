class Solution {
    public int[] twoSum(int[] numbers, int k) {
        int i=0;
        int j=numbers.length-1;
        while(i<j && i<numbers.length){
            int sum = numbers[i]+numbers[j];
            if(sum == k){
                return new int[]{i+1,j+1};
            }else if(sum<k){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}