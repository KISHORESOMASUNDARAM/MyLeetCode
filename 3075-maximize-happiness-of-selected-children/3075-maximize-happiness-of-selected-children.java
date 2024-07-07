class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        long val=0;
        int cnt=0,n1=0;
        int max=Integer.MIN_VALUE;
        int n=hap.length;
        long ans=0;
        Arrays.sort(hap);
        if(k==1){
            return hap[n-1];
        }
        for(int i=n-1;i>=0;i--){
            if(hap[i]-cnt>=0 && n1<k){
            val=Math.max(hap[i]-cnt,0);
            ans+=val;
            }
            n1++;
            cnt++;
        }
        return ans;
    }
}