class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans[] = new int[nums1.length];
        Stack<Integer> st = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            int num = nums2[i];

            while(!st.isEmpty() && st.peek()<num){
                st.pop();
            }

            if(st.isEmpty()){
                hm.put(num,-1);
                st.push(num);
            }else if(st.peek()>num){
                hm.put(num,st.peek());
                st.push(num);
            }else{
                st.push(num);
            }
        }
        for(int i=0;i<nums1.length;i++){
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }
}