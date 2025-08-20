class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            int n=s.length();
            int sum1=0;
            int sum2=0;
            if(n%2==0){
                for(int k=0;k<n/2;k++){
                    sum1=sum1+s.charAt(k)-'0';
                }
                for(int j=n/2;j<n;j++){
                    sum2=sum2+s.charAt(j)-'0';
                }
            }
            if(sum1==sum2&&sum1>0&&sum2>0){
                count++;
            }
        }
        return count;
    }
}