class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int ls=0,rs=0,sum=0;
        if(n==k){
            for(int x:arr){
                sum+=x;
            }
            return sum;
        }
        for(int i=0;i<k;i++) ls+=arr[i];
        sum=ls;
        int right=n-1;
        for(int i=k-1;i>=0;i--){
            ls-=arr[i];
            rs+=arr[right];
            sum=Math.max(sum,ls+rs);
            right--;
        }
        return sum;
    }
}