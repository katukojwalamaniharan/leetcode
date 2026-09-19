class Solution {
    ArrayList<Integer> primeFactors(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2;i*i <= n;i++){
            while(n%i == 0){
                ans.add(i);
                n/=i;
            }
        }
        if(n>1) ans.add(n);
        return ans;
    }
}
