class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        long val=0,n1=0;
        int cnt=0;
        int max=Integer.MIN_VALUE;
        int n=hap.length;
        Arrays.sort(hap);
        if(k==1){
            for(int i=0;i<n;i++){
            if(hap[i]>max){
                max=Math.max(hap[i],max);
            }
            }
            return max;
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
               val=hap[i];
               cnt++;
            }
            else if(hap[i]-cnt>=0 && n1<k){
                val+=Math.max(hap[i]-cnt,0);
                cnt++;
            }
            n1++;

        }
        return val;
    }
}