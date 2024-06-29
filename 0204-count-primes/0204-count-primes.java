class Solution {
    public int countPrimes(int n) {
        int cnt=0;
        if(n==0 || n==1){
            return 0;
        }
        boolean[] arr=new boolean[n+1];
        for(int i=2;i*i<n;i++){
            for(int j=i*2;j<=n;j+=i){
                arr[j]=true;
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==false){
                cnt++;
            }
        }
        return cnt;
    }
}