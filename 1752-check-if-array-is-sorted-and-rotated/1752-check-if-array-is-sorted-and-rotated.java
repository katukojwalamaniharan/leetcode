class Solution {
    public boolean check(int[] nums) {
        int count = 0;

        if (nums[0] < nums[nums.length - 1])
            count++;

        for (int i = 1; i < nums.length; i++)
            count = nums[i - 1] > nums[i] ? count + 1 : count;

        return count > 1 ? false : true;
    }
}