class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int sum=0,ind=0;
        for(int s:nums){
            for(int i=0;i<n;i++){
                sum+=Math.abs(s-nums[i]);
            }
            arr[ind++]=sum;
             sum=0;
        }
        return arr;
    }
}