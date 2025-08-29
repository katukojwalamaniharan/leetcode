class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            int temp=i;
            boolean res=true;
            while(temp>0){
                int dig=temp%10;
                if(dig==0||num%dig!=0){
                    res=false;
                    break;
                }
                temp=temp/10;
            }
            if (res) arr.add(num);
        }
        return arr;
    }
}