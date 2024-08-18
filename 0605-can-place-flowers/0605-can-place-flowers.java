class Solution {
    public boolean canPlaceFlowers(int[] fl, int n) {
        int cnt=0;

        for(int i=0;i<fl.length;i++){
            if(fl[i]==0){
            boolean empty=(i==0 || fl[i-1]==0 );
            boolean emptynxt=(i==fl.length-1 || fl[i+1]==0 );
            if(empty && emptynxt){
                fl[i]=1;
                cnt++;
                if(cnt>n){
                    return true;
                }
             }
            }
        }
        return cnt>=n;
    }
}