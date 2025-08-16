class Solution {
    public int maximum69Number (int num) {
        int temp=num;
        int index=0;
        int curr=1;
        while(temp>0){
            int deg=temp%10;
            if(deg==6){
                index=curr;
            }
            curr=curr*10;
            temp=temp/10;
        }
        return num+index*3;
    }
}