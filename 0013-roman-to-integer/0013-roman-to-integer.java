class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> roman=new HashMap<>();
        int ans=0;
        int n=0;
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        for(int i=0;i<s.length();i++){
            int c=roman.get(s.charAt(i));
            if(i+1<s.length()){
                n=roman.get(s.charAt(i+1));
            }
            if(c>=n){
                ans+=c;
            }else if(c<n){
                ans=ans-c;
            }
        }
        return ans;
    }
}