class Solution {
    public void duplicateZeros(int[] arr) {
        int count=0;
        int n=arr.length;
        for(int x:arr){
            if(x==0) count++;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==0) count--;
            int j=count+i;
            if(j<n) arr[j]=arr[i];
            if(arr[i]==0&&j+1<n) arr[j+1]=0;
        }
    }
}