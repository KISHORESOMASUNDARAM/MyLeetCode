class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0,sum=0;
        int val=prices[0];
        for(int i=1;i<n;i++){
            if(val<prices[i]){
                sum=prices[i]-val;
                max=Math.max(sum,max);
            }
            else{
                if(prices[i]<val){
                    val=prices[i];
                }
            }
        }
        return max;
    }
}