class Solution {
    public ArrayList<Integer> twoSum(int[] numbers, int k) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == k) {
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(i + 1);
                ans.add(j + 1);
                return ans;
            } 
            else if (sum < k) {
                i++;
            } 
            else {
                j--;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}