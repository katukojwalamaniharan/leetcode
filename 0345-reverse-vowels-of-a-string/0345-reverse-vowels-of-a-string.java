class Solution {
    public String reverseVowels(String s) {
        String v = "aeiouAEIOU";
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<=j){
            if(v.indexOf(arr[i])!=-1 && v.indexOf(arr[j])!=-1){
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
                j--;
            }else if(v.indexOf(arr[i])!=-1){
                j--;
            }else if(v.indexOf(arr[j])!=-1){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}