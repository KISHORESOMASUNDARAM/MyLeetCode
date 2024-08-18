class Solution {
    public boolean canPlaceFlowers(int[] fl, int n) {
        
        for(int i=0;i<n-1;i+=n){
            if(fl[i]!=fl[i+1]){
                return false;
            }
        }
        return true;
    }
}