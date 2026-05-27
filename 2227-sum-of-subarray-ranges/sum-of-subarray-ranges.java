class Solution {
    public long subArrayRanges(int[] nums) {
       return max(nums)-min(nums);
    }
    public long max(int[] nums){
        long ans = 0;
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> pge = new ArrayList<>();
        ArrayList<Integer> nge = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            while(!s.isEmpty() && nums[s.peek()]<num) s.pop();
            if(s.isEmpty())pge.add(-1);
            else pge.add(s.peek());
            s.add(i);
        }
        s.clear();
        for(int i=nums.length-1;i>=0;i--){
            int num = nums[i];
            while(!s.isEmpty() && nums[s.peek()]<=num) s.pop();
            if(s.isEmpty()) nge.add(nums.length);
            else nge.add(s.peek());
            s.add(i);
        }
        Collections.reverse(nge);
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int left = i-pge.get(i);
            int right = nge.get(i)-i;
            ans+=1L*left*right*num;
        }
        return ans;
    }
    public long min(int[] nums){
        long ans = 0;
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> pse = new ArrayList<>();
        ArrayList<Integer> nse = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            while(!s.isEmpty() && nums[s.peek()]>num) s.pop();
            if(s.isEmpty())pse.add(-1);
            else pse.add(s.peek());
            s.add(i);
        }
        s.clear();
        for(int i=nums.length-1;i>=0;i--){
            int num = nums[i];
            while(!s.isEmpty() && nums[s.peek()]>=num) s.pop();
            if(s.isEmpty()) nse.add(nums.length);
            else nse.add(s.peek());
            s.add(i);
        }
        Collections.reverse(nse);
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int left = i-pse.get(i);
            int right = nse.get(i)-i;
            ans+=1L*left*right*num;
        }
        return ans;
    }
}