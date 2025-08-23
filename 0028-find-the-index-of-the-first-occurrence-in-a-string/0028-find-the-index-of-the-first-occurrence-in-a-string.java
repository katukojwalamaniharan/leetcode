class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=0;
        int count=0;
        while(j<needle.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                count++;
                if(count==needle.length()){
                    return i-j;
                }
            }else{
                count--;
                i++;
                if(i==haystack.length()-1) return -1;
            }
        }
        return -1;
    }
}