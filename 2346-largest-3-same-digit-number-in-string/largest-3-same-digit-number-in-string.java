class Solution {
    public String largestGoodInteger(String num) {
        int ans=-1;
        for(int i=0;i+2<num.length();i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)){
                int n=num.charAt(i)-'0';
                ans=Math.max(ans,n);
            }
        }
        String aa=String.valueOf(ans)+String.valueOf(ans)+String.valueOf(ans);
        if(ans!=-1){
            //return String.valueOf(ans);
            return aa;
        }
        return "";
    }
}