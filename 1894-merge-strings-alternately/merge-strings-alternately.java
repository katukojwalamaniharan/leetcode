class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int c=a+b;
        String s=word1+word2;
        StringBuilder sb=new StringBuilder();
        if(a==b){
            for(int i=0;i<a;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }else if(a<b){
            for(int i=0;i<a;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for(int j=a;j<b;j++){
                sb.append(word2.charAt(j));
            }
            
        }else{
            for(int i=0;i<b;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for(int j=b;j<a;j++){
                sb.append(word1.charAt(j));
            }
        }
        String ans=sb.toString();

        return ans;
    }
}