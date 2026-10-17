class Solution {
    public String reverseVowels(String s) {
        String v = "aeiouAEIOU";
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            while(i<j && !isVowel(arr[i])) i++;
            while(i<j && !isVowel(arr[j])) j--;
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}