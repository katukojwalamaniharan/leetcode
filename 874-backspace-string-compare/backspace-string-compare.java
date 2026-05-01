class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int i=0;
        int j=0;
        while(i<s.length()){
            char c = s.charAt(i++);
            if(c == '#'){
                if(!s1.isEmpty()) s1.pop();
            }
            else s1.add(c);
        }
        while(j<t.length()){
            char ch = t.charAt(j++);
            if(ch == '#'){
                if(!s2.isEmpty()) s2.pop();
            }
            else s2.add(ch);
        }
        return s1.equals(s2);
    }
}