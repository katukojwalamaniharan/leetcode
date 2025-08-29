class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cd1=-1;
        int cd2=-1;
        int count1=0;
        int count2=0;
        int i=0;
        while(i<nums.length){
            int num=nums[i];
            if(num==cd1){
                count1++;
            }else if(num==cd2){
                count2++;
            }else if(count1==0){
                cd1=num;
                count1++;
            }else if(count2==0){
                cd2=num;
                count2++;
            }else{
                count1--;
                count2--;
            }
            i++;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int c1=0;
        int c2=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==cd1) c1++;
            if(nums[i]==cd2) c2++;
        }
        if(cd1==cd2){
            ans.add(cd1);
        }else{
            if(c1>nums.length/3) ans.add(cd1);
            if(c2>nums.length/3) ans.add(cd2);
        }
        return ans;
    }
}