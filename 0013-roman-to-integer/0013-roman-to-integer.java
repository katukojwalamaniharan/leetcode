class Solution {
    public int romanToInt(String s) {
        //int c=0;
        int total=0;
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        //System.out.println(M);
        for(int i=0;i<s.length();i++){
            int p=map.get(s.charAt(i));
            //int n=map.get(s.charAt(i+1));
            if(i<s.length()-1 && p<map.get(s.charAt(i+1))){
                total-=p;
            }
            else{
                total+=p;
            }
           // n=p;
        }
        return total;
    }
}