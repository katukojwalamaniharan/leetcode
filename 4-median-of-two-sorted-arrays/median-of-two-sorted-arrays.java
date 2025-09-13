class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        // int[] arr=new int[n+m];
        List<Integer> arr=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[j]);
                j++;
            }
        }
        while(i<n){arr.add(nums1[i]);
            i++;
        }
        while(j<m){
            arr.add(nums2[j]);
            j++;
        }
        if((n+m)%2!=0){
            return arr.get((n+m)/2);
        }
        int k=(n+m)/2;
        return (arr.get(k-1)+arr.get(k))/2.0;
    }
}