class Solution {
    public boolean isPalindrome(int x) {
       int rev=0;
       int org=x;
       if(x<0){
        //System.out.println("false");
        return false;
       }
       while(x>0){
        int digit=x%10;
        rev=rev*10+digit;
        x=x/10;
       }
       return rev==org;
    }
}