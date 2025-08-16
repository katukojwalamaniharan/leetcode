class Solution {
        public int maximum69Number (int num) {
            String s=num+"";
            char[] arr=s.toCharArray();
            for(int i=0;i<s.length();i++){
                if(arr[i]=='6'){
                    arr[i]='9';
                    break;
                }
            }
            String ans=new String(arr);
            return Integer.parseInt(ans);
    }
}