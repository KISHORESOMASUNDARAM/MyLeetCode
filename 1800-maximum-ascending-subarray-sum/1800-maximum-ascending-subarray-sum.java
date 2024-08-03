class Solution {
    public int maxAscendingSum(int[] arr) {
        int cur=arr[0],ans=arr[0];
        for(int i=1;i<arr.length;++i){
            if(arr[i]<arr[i-1])  cur=arr[i];
            else  cur+=arr[i];
            ans=Math.max(cur,ans);
        }
        return ans;
    }
}