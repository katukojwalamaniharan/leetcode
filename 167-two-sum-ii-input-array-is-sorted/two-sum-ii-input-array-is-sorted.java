class Solution {
    public int bin(int[] numbers,int a,int b,int req){
            while(a<=b){
                int mid=a+(b-a)/2;
            if(numbers[mid]==req){
                return mid;
            }else if(numbers[mid]<req){
                a=mid+1;
            }else{
                b=mid-1;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int a=0;
        int b=n-1;
        for(int i=0;i<n;i++){
            if(numbers[i]<=target){
                int req=target-numbers[i];
                int inx=bin(numbers,i+1,n-1,req);
                if(inx!=-1){
                    return new int[] {i+1,inx+1};
                }
            }else if(target<0){
                int req=target-numbers[i];
                int inx=bin(numbers,i+1,n-1,req);
                if(inx!=-1){
                    return new int[] {i+1,inx+1};
                }
            }
        }
        return new int[] {-1,-1};
    }
}