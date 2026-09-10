class Solution {
    public boolean isPalinSent(String s) {
        // code here
        return isPalindrome(s);
    }
    public boolean isPalindrome(String s) {
            s=s.toLowerCase();
            int i=0;
            int j=s.length()-1;
            while(i<=j&&i<s.length()-1 && j>=0){
                while(i<s.length()&&!Character.isLetterOrDigit(s.charAt(i))){
                    i++;
                }
                while(j>=0&&!Character.isLetterOrDigit(s.charAt(j))){
                    j--;
                }
                if(i<s.length()&&j>=0&&s.charAt(i)!=s.charAt(j)) return false;
                else {
                    i++;
                    j--;
                }
            }
            return true;
        }
}