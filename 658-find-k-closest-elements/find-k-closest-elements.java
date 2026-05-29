class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = findFloor(arr,x);
        int j = i+1;
        List<Integer> ans = new ArrayList<>();
        while(k>0 && i>=0 && j<arr.length){
            if(Math.abs(x-arr[i])<=Math.abs(x-arr[j])){
                ans.add(arr[i]);
                i--;
            }else{
                ans.add(arr[j++]);
            }
            k--;
        }

        // left remaining
        while (k > 0 && i >= 0) {
            ans.add(arr[i--]);
            k--;
        }

        // right remaining
        while (k > 0 && j < arr.length) {
            ans.add(arr[j++]);
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
    private int findFloor(int[] arr,int x){
        int i=0;
        int j=arr.length-1;
        int ans = 0;
        while(i<=j){
            int mid = (j+i)/2;
            if(arr[mid] == x) return mid;
            else if(arr[mid]<x){
                ans = mid;
                i = mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }
}