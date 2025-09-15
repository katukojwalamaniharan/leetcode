/*




class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0,r=0;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(r=0;r<n;r++){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            if((r-l+1)>ans) ans=r-l+1;
        }
        return ans;
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0,r=0;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(r=0;r<n;r++){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            if((r-l+1)>ans) ans=r-l+1;
        }
        return ans;
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0,r=0;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(r=0;r<n;r++){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            if((r-l+1)>ans) ans=r-l+1;
        }
        return ans;
    }
}

 */
class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0,r=0;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(r=0;r<n;r++){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            if((r-l+1)>ans) ans=r-l+1;
        }
        return ans;
    }
}