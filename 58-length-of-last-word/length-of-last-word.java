class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        int index=0;
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==' '){

            }
            else{
                index=i;
                break;
            }
        }
        for(int i=index;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}