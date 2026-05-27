class Solution {
    public int sumSubarrayMins(int[] arr) {
        ArrayList<Integer> nse = new ArrayList<>();
        ArrayList<Integer> pse = new ArrayList<>();
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int num = arr[i];
            while(!s1.isEmpty() && arr[s1.peek()]>=num) s1.pop();
            if(s1.isEmpty())nse.add(arr.length);
            else nse.add(s1.peek());
            s1.push(i);
        }
        Collections.reverse(nse);
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            while(!s2.isEmpty() && arr[s2.peek()]>num) s2.pop();
            if(s2.isEmpty()) pse.add(-1);
            else pse.add(s2.peek());
            s2.push(i);
        }
        long ans = 0;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int left = i-pse.get(i);
            int right = nse.get(i)-i;
            ans = (ans + (1L * left * right * num) % 1000000007) % 1000000007;
        }
        return (int)ans;
    }
}