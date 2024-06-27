class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int cnt=fun(i);
            arr[i]=cnt;
        }
        return arr;
    }
    int fun(int n){
        int cnt=0;
        for(int i=0;i<32;i++){
            if((n>>i)%2==1){
                cnt++;
            }
        }
        return cnt;
    }
}