class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = lb(nums, target);
        
        // If target is not present
        if(left == nums.length || nums[left] != target) 
            return new int[]{-1, -1};
        
        int right = ub(nums, target) - 1;
        return new int[]{left, right};
    }
    
    // Lower bound → first index where nums[i] >= target
    public int lb(int[] nums, int target){
        int l = 0, h = nums.length - 1;
        int ans = nums.length; // if not found, points past last element
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(nums[mid] >= target){
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
    
    // Upper bound → first index where nums[i] > target
    public int ub(int[] nums, int target){
        int l = 0, h = nums.length - 1;
        int ans = nums.length; // if not found, points past last element
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(nums[mid] > target){
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
