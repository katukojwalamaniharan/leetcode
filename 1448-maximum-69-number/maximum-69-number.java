class Solution {
    public int maximum69Number (int num) {
        String s=num+"";
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6'){
                idx=i+1;
                break;
            }
        }
        if(idx>0){
            int number=(int)Math.pow(10,(int)s.length()-idx);
            number=number*3;
            num=num+number;
        }
        return num;
    }
}