class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> seen = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int wanted = -1*(nums[i]+nums[j]);
                if(seen.contains(wanted)){
                    List<Integer> inner = Arrays.asList(nums[i],nums[j],wanted);
                    if(!ans.contains(inner)) ans.add(inner);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}